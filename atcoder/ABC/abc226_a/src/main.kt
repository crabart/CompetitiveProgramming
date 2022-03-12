import java.io.PrintWriter

fun next() = readLine()!!
fun nextDouble() = next().toDouble()

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val x = nextDouble()
    var ans = 0
    if (x - x.toInt().toDouble() < 0.5) {
        ans = x.toInt()
    }
    else
    {
        ans = x.toInt() + 1
    }

    println(ans)
}