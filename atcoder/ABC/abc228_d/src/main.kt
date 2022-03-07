import java.io.PrintWriter
import java.util.*

fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLongList() = next().split(" ").map{ it.toLong() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val q = nextInt()

    val n = 1048576L

    val m = mutableMapOf<Long, Long>()
    val submit = (0 until n).toCollection(TreeSet())
    repeat(q) {
        val (t, x) = nextLongList()

        when(t) {
            1L -> {
                val a = x % n
                val i = submit.ceiling(a)?:submit.ceiling(0)
                m[i] = x
                submit.remove(i)
            }

            2L -> {
                val target = x % n
                println(if (m.containsKey(target)) m[target]!! else -1)
            }
        }
    }
}