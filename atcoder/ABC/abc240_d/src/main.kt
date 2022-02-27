fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextIntList() = next().split(" ").map{ it.toInt() }

fun main() {
    val n = nextInt()
    val l = nextIntList()

    var ml = mutableListOf<Int>()

    for (i in l) {
        ml.add(i)

        var isSame = true
        for (j in 1..i) {
            val tmp = ml.size - j
            if (tmp < 0) {
                isSame = false
                break
            }
            if (i != ml[tmp]) {
                isSame = false
                break
            }
        }

        if (isSame) {
            ml = ml.subList(0, ml.size - i)
        }

        println(ml.size)
    }
}