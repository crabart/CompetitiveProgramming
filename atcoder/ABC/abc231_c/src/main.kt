import java.io.PrintWriter
fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextList() = next().split(" ")
fun nextIntList() = next().split(" ").map{ it.toInt() }
fun nextLongList() = next().split(" ").map{ it.toLong() }
fun nextDoubleList() = next().split(" ").map{ it.toDouble() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (n, q) = nextIntList()
    val a = nextIntList()

    val mlQ = mutableListOf<Int>()

    repeat(q) {
        mlQ.add(nextInt())
    }

    val sa = a.sorted()

    val mapAns = mutableMapOf<Int, Int>()

    val smlQ = mlQ.sorted()

    var cnt = 0
    var rec = -1
    for (i in smlQ) {
        val start = rec
        for (j in start + 1 until n) {
            if (sa[j] >= i) {
                mapAns[i] = n - cnt
                break
            }
            cnt++
            rec = j
        }
    }

    for (i in mlQ) {
        println(if (mapAns[i] != null) mapAns[i] else 0)
    }
}