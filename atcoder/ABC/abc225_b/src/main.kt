import java.io.PrintWriter
fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val n = nextInt()

    val arr = Array(n) {0}

    repeat(n - 1) {
        val (a, b) = nextIntList()
        arr[a - 1]++
        arr[b - 1]++
    }

    println(if (arr.contains(n - 1)) "Yes" else "No")
}