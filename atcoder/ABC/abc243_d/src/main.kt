import java.io.PrintWriter

fun next() = readLine()!!
fun nextLongList() = next().split(" ").map{ it.toLong() }

@JvmField val _writer = PrintWriter(System.out, false)
@kotlin.ExperimentalStdlibApi
fun main() { _writer.solve(); _writer.flush() }
@kotlin.ExperimentalStdlibApi
fun PrintWriter.solve() {
    val (n, x) = nextLongList()

    val s = next()

    val que = ArrayDeque<Char>()

    for (i in s) {
        when (i) {
            'U' -> {
                if (que.isNotEmpty() && (que.last() == 'L' || que.last() == 'R')) {
                    que.removeLast()
                }
                else {
                    que.add('U')
                }

            }

            'L' -> {
                que.add('L')
            }

            'R' -> {
                que.add('R')
            }
        }
    }

    var ans = x
    for (i in que) {
        when (i) {
            'L' -> ans *= 2
            'R' -> ans = ans * 2 + 1
            'U' -> ans /= 2
        }
    }

    println(ans)
}