import java.io.PrintWriter
fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    next()
    val a = nextIntList()
    val b = nextIntList()

    val set = mutableSetOf<Int>()

    for (i in a) {
        set.add(i)
    }

    var ansSame = 0
    var ansDiff = 0
    for (i in b.indices) {
        if (a[i] == b[i]) {
            ansSame++
        }
        else if (set.contains(b[i])) {
            ansDiff++
        }
    }

    println(ansSame)
    println(ansDiff)
}