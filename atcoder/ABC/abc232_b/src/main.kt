import java.io.PrintWriter
fun next() = readLine()!!

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val s = next()
    val t = next()

    var ans = true
    val move = (t[0].toInt() + 26 - 'a'.toInt() - s[0].toInt() - 'a'.toInt()) % 26
    for (i in 1 until s.length) {
        if (move != (t[i].toInt() + 26 - 'a'.toInt() - s[i].toInt() - 'a'.toInt()) % 26) {
            ans = false
            break
        }
    }

    println(if (ans) "Yes" else "No")
}