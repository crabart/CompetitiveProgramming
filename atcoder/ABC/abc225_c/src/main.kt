import java.io.PrintWriter
fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (n, m) = nextIntList()

    val ml = mutableListOf<List<Int>>()

    repeat(n) {
        ml.add(nextIntList())
    }

    var ans = true

    // 1並びか
    for (i in 0 until ml[0].size - 1) {
        if (ml[0][i + 1] - ml[0][i] != 1) {
            println("No")
            return
        }
    }

    // 同じ列か
    if ((ml[0][0] / 7 != ml[0].last() / 7 ||
        ml[0][0] % 7 == 0) &&
        ml[0].last() % 7 != 0) {
        println("No")
        return
    }

    // 行は7インクリメントか？
    for (i in 0 until ml.size - 1) {
        for (j in 0 until ml[i].size) {
            if (ml[i + 1][j] - ml[i][j] != 7) {
                println("No")
                return
            }
        }
    }

    println("Yes")
}