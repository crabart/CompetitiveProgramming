import java.lang.Integer.max

fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

fun main(){
    next()
    val l = nextIntList()

    val ml = mutableListOf<Int>(0, 360)

    var sumAngle = 0
    for (i in l){
        sumAngle += i
        sumAngle %= 360
        ml.add(sumAngle)
    }

    ml.sort()

    var maxAngle = 0

    for (i in 0 until ml.size - 1){
        val tmp = ml[i + 1] - ml[i]
        maxAngle = max(maxAngle, tmp)
    }

    println(maxAngle)
}