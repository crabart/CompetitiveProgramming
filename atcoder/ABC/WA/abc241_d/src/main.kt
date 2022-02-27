fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextList() = next().split(" ")

fun main () {
    val n = nextInt()

    val ml = mutableListOf<Int>()

    for (i in 1..n) {
        val l = nextList()

        when (l[0]) {
            "1" -> {
                ml.add(l[1].toInt())
            }

            "2" -> {
                val mlS = ml.filter { it <= l[1].toInt() }.toMutableList()
                if (l[2].toInt() <= mlS.size) {
                    mlS.sortDescending()
                    println(mlS[l[2].toInt() - 1])
                }
                else {
                    println("-1")
                }
            }

            "3" -> {
                val mlS = ml.filter { it >= l[1].toInt() }.toMutableList()
                if (l[2].toInt() <= mlS.size) {
                    mlS.sort()
                    println(mlS[l[2].toInt() - 1])
                }
                else {
                    println("-1")
                }
            }
        }
    }
}