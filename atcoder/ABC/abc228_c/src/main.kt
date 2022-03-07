import java.io.PrintWriter
fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (n, k) = nextIntList()

    val ml = mutableListOf<Int>()

    repeat(n) {
        val (a, b, c) = nextIntList()
        ml.add(a + b + c)
    }

    val l = ml.sortedDescending()

    val target = l[k - 1]

    for (i in ml) {
        if (target - 300 <= i) {
            println("Yes")
        }
        else {
            println("No")
        }
    }
}