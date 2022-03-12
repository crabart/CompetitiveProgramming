import java.io.PrintWriter
fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (v, a, b, c) = nextIntList()

    val m = v % (a + b + c)
    if (m < a) {
        println("F")
    }
    else if (m < a + b) {
        println("M")
    }
    else {
        println("T")
    }
}