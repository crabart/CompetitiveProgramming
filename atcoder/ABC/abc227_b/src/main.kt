import java.io.PrintWriter
fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    next()

    val a = nextIntList()

    var ans = 0
    for (i in a) {
        var calc = false
        hoge@ for (x in 1..(i / 3)) {
            for (y in 1..(i / 3)) {
                if (i == 4 * x * y + 3 * x + 3 * y) {
                    calc = true
                    break@hoge
                }
            }
        }

        if (!calc) {
            ans++
        }
    }

    println(ans)
}