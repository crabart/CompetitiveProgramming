import java.io.PrintWriter
import java.util.PriorityQueue
import kotlin.math.min

fun next() = readLine()!!
fun nextLongList() = next().split(" ").map{ it.toLong() }

@JvmField val _writer = PrintWriter(System.out, false)
@kotlin.ExperimentalStdlibApi
fun main() { _writer.solve(); _writer.flush() }
@kotlin.ExperimentalStdlibApi
fun PrintWriter.solve() {
    val (n, w) = nextLongList()

    val que = PriorityQueue<Pair<Long, Long>>() {i1, i2 ->
        return@PriorityQueue (i2.first - i1.first).toInt()
    }
    repeat(n.toInt()) {
        val (a, b) = nextLongList()
        que.add(a to b)
    }

    var g = 0L
    var cnt = 0L
    while (g < w && que.isNotEmpty()) {
        val tmp = que.poll()
        val m = min(tmp.second, w - g)
        cnt += (tmp.first * m)
        g += m
    }

    println(cnt)
}