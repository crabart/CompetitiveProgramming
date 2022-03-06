import java.io.PrintWriter
fun next() = readLine()!!
fun nextLongList() = next().split(" ").map{ it.toLong() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (n1, k) = nextLongList()
    val n = n1.toInt()
    val a = nextLongList()

    val arr = LongArray(n + 1){0}

    for (i in 1..n) {
        arr[i] = a[i - 1] + arr[i - 1]
    }

    var ans = 0
    for (i in 0 until n) {
        for (j in i + 1..n) {
            if (arr[j] - arr[i] == k) {
                ans++
            }
        }
    }

    println(ans)
}