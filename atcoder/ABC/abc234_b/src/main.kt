import kotlin.math.sqrt

fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextIntList() = next().split(" ").map{ it.toInt() }

fun main() {
    val n = nextInt()

    val ml = mutableListOf<List<Int>>()

    for (i in 1..n) {
        ml.add(nextIntList())
    }

    var ans = 0.0
    for (i in 0 until ml.size - 1) {
        for (j in i + 1 until ml.size) {
            val x = ml[j][0] - ml[i][0]
            val y = ml[j][1] - ml[i][1]
            val tmp = sqrt(x.toDouble() * x + y * y)
            ans = Math.max(ans, tmp)
        }
    }

    println(ans)
}