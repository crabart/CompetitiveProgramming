import java.io.PrintWriter
fun next() = readLine()!!

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val s1 = next()
    val s2 = next()

    var ans = true
    if ((s1 == "#." && s2 == ".#") || (s1 == ".#" && s2 == "#.")) {
        ans = false
    }

    println(if (ans) "Yes" else "No")
}