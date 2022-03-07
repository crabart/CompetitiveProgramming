import java.io.PrintWriter
fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (n, x) = nextIntList()
    val a = nextIntList()

    var i = x - 1
    val s = mutableSetOf<Int>()
    s.add(x - 1)
    while(true) {
        if (s.contains(a[i] - 1)) {
            break
        }
        s.add(a[i] - 1)
        i = a[i] - 1
    }

    println(s.size)
}