import java.io.PrintWriter
fun next() = readLine()!!
fun nextInt() = next().toInt()

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val d = nextInt()

    println(d / 100.0)
}