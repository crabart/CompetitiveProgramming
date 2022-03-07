import java.io.PrintWriter
fun next() = readLine()!!
fun nextLong() = next().toLong()

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val n = nextLong()

    var sum = 0L
    for (i in 1..n) {
        val tmp = n / i
        if (tmp != 1L) {
            sum += tmp
        }
        else {
            sum += (n - i + 1)
            break
        }
    }

    println(sum)
}