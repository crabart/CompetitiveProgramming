import java.io.PrintWriter
fun next() = readLine()!!

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val s = next()
    println((s[0].toInt() - '0'.toInt()) * (s[2].toInt() - '0'.toInt()))
}