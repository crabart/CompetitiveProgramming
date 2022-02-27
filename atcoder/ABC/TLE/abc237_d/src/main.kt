fun next() = readLine()!!
fun nextInt() = next().toInt()

fun main(){
    val n = nextInt()
    val s = next()

    val ml = mutableListOf<Int>(0)

    var index = 0
    for (i in 0 until n){
        when (s[i]){
            'L' -> {
                ml.add(index, i + 1)
            }

            'R' -> {
                ml.add(index + 1, i +1)
                index++
            }
        }
    }

    for (i in 0 until ml.size - 1){
        print("${ml[i]} ")
    }
    println(ml[ml.size - 1])
}