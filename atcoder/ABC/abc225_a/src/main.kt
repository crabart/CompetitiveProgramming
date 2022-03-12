import java.io.PrintWriter
fun next() = readLine()!!

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val s = next()

    val set = mutableSetOf<Char>()

    for (i in s.indices) {
        set.add(s[i])
    }

    when (set.size) {
        1 -> println(1)
        2 -> println(3)
        3 -> println(6)
    }
}