import java.io.PrintWriter
import java.util.PriorityQueue
import kotlin.math.max
import kotlin.math.min

fun next() = readLine()!!
fun nextLongList() = next().split(" ").map{ it.toLong() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (n, a, b) = nextLongList()

    val (p, q, r, s) = nextLongList()

    val que = PriorityQueue<Pair<Long, Long>>() {i1 : Pair<Long, Long>, i2 : Pair<Long, Long> ->
        return@PriorityQueue if (i1.first == i2.first) {
            (i1.second - i2.second).toInt()
        }
        else {
            (i1.first - i2.first).toInt()
        }
    }

    var fmin = max(1 - a, 1 - b)
    var fmax = min(n - a, n - b)

    val set = mutableSetOf<Pair<Long, Long>>()
    for (k in fmin..fmax) {
        set.add(a + k to b + k)
    }

    val smin = max(1 - a, b - n)
    val smax = min(n - a, b - 1)

    for (k in smin..smax) {
        set.add(a + k to b - k)
    }

    for (i in set) {
        if (i.first in p..q &&
                i.second in r..s) {
            que.add(i)
        }
    }

    var tmp = que.poll()
    for (i in p..q) {
        for (j in r..s) {
            if (tmp != null && i == tmp.first && j == tmp.second) {
                print('#')
                tmp = que.poll()
            }
            else {
                print('.')
            }
        }
        println()
    }
}