import java.io.PrintWriter
import java.util.PriorityQueue

fun next() = readLine()!!
fun nextLongList() = next().split(" ").map{ it.toLong() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (n, k) = nextLongList()
    val a = nextLongList()
    val que = PriorityQueue<Long>(){i1, i2 -> return@PriorityQueue i2.compareTo(i1) }

    for (i in a) {
        que.add(i)
    }

    var ans = 0L
    while (que.size >= k) {
        val ml = mutableListOf<Long>()
        for (i in 0 until k) {
            val tmp = que.poll()
            ml.add(tmp)
        }

        ans += ml.last()

        for (i in 0 until k) {
            ml[i.toInt()] -= ml.last()
        }

        for (i in ml) {
            if (i != 0L) {
                que.add(i)
            }
        }
    }

    println(ans)
}