import java.io.PrintWriter
import kotlin.math.ceil

fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (x, y) = nextIntList()

    if (x >= y) {
        println(0)
    }
    else {
        val tmp = y - x
        println(ceil(tmp / 10.0).toInt())
    }
}