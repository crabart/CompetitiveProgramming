import java.io.PrintWriter
fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (l, r) = nextIntList()
    val s = next()

    val top = s.substring(0, l - 1)
    val middle = s.substring(l - 1, r).reversed()
    val end = s.substring(r, s.length)

    println(top + middle + end)
}