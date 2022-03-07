import java.io.PrintWriter
fun next() = readLine()!!
fun nextInt() = next().toInt()

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val n = nextInt()

    println(if (n >= 42) "AGC" + "%03d".format(n + 1) else "AGC" + "%03d".format(n))
}