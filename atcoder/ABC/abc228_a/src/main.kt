import java.io.PrintWriter
fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (a, b, c) = nextIntList()

    var target = c
    var after = b
    if (b < a) {
        after = b + 24
        if (c < b) {
            target = c + 24
        }
    }
    if (target in a..after) {
        println("Yes")
    }
    else {
        println("No")
    }
}