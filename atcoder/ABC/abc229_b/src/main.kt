import java.io.PrintWriter
fun next() = readLine()!!
fun nextLongList() = next().split(" ").map{ it.toLong() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    var (a, b) = nextLongList()

    var ans = true
    while(a != 0L && b != 0L) {
        val tmpA = a % 10L
        val tmpB = b % 10L

        if (tmpA + tmpB >= 10L) {
            ans = false
            break
        }

        a /= 10L
        b /= 10L
    }

    println(if (ans) "Easy" else "Hard")
}