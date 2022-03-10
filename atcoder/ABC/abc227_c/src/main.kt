import java.io.PrintWriter
import kotlin.math.ceil
import kotlin.math.sqrt

fun next() = readLine()!!
fun nextLong() = next().toLong()

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val n = nextLong()

    val max = ceil(Math.cbrt(n.toDouble())).toLong()

    var ans = 0L
    for (a in 1..max) {
        val max2 = ceil(sqrt((n.toDouble() / a))).toLong()
        for (b in a..max2) {
            val c = n / a / b
            if (c >= b) {
                ans += (c - b + 1L)
            }
        }
    }

    println(ans)
}