import java.io.PrintWriter
fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (n, k ,a) = nextIntList()



    if (n == 1) {
        println(1)
    }
    else {
        val tmp = k % n
        var tmp2 = a + tmp - 1
        if (tmp2 > n) {
            tmp2 -= n
        }
        println(tmp2)
    }
}