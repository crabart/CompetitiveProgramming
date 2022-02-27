fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextList() = next().split(" ")

fun main () {
    val n = nextInt()

    val ml = mutableListOf<Long>()
    var mlR = mutableListOf<Long>()

    var isSorted = false
    for (i in 1..n) {
        val l = nextList()

        when (l[0]) {
            "1" -> {
                ml.add(l[1].toLong())
                isSorted = false
            }

            "2" -> {
                if (!isSorted) {
                    ml.sort()
                    mlR = ml.asReversed()
                    isSorted = true
                }

                val mlS = mlR.filter { it <= l[1].toLong() }.toMutableList()
                if (l[2].toInt() <= mlS.size) {
                    println(mlS[l[2].toInt() - 1])
                }
                else {
                    println("-1")
                }
            }

            "3" -> {
                if (!isSorted) {
                    ml.sort()
                    mlR = ml.asReversed()
                    isSorted = true
                }

                val mlS = ml.filter { it >= l[1].toLong() }.toMutableList()
                if (l[2].toInt() <= mlS.size) {
                    println(mlS[l[2].toInt() - 1])
                }
                else {
                    println("-1")
                }
            }
        }
    }
}
