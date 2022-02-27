import java.util.*

fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLongList() = next().split(" ").map{ it.toLong() }

fun main () {
    val n = nextInt()

    val tr = TreeSet<Pair<Long, Int>> { x: Pair<Long, Int>, y: Pair<Long, Int> ->
        val tmp = x.first.compareTo(y.first)
        if (tmp == 0) {
            x.second.compareTo(y.second)
        } else {
            tmp
        }
    }

    for (i in 1..n) {
        val l = nextLongList()

        when (l[0]) {
            1L -> {
                tr.add(l[1] to i)
            }

            2L -> {
                var trL = tr.headSet(l[1] to Int.MAX_VALUE, true)

                if (l[2].toInt() <= trL.size){
                    println(trL.elementAt(trL.size - l[2].toInt()).first)
                }
                else {
                    println("-1")
                }
            }

            3L -> {
                var trH = tr.tailSet(l[1] to -1, true)

                if (l[2].toInt() <= trH.size){
                    println(trH.elementAt(l[2].toInt() - 1).first)
                }
                else {
                    println("-1")
                }
            }
        }
    }
}