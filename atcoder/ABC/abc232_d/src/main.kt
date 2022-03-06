import java.io.PrintWriter
import kotlin.math.max

fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (h, w) = nextIntList()

    val arr = Array<String>(h) {""}
    val visited = Array(h){IntArray(w) {0} }

    repeat(h) {
        arr[it] = next()
    }

    val que = ArrayDeque<Triple<Int, Int, Int>>()
    que.add(Triple(0, 0, 1))
    visited[0][0] = 1
    var max = 1
    while(que.isNotEmpty()) {
        val tmp = que.removeFirst()

        max = max(max, tmp.third)

        val x = tmp.first
        val y = tmp.second
        if (x + 1 < h && arr[x + 1][y] != '#' && visited[x + 1][y] == 0) {
            visited[x + 1][y] = tmp.third + 1
            que.add(Triple(x + 1, y, tmp.third + 1))
        }

        if (y + 1 < w && arr[x][y + 1] != '#' && visited[x][y + 1] == 0) {
            visited[x][y + 1] = tmp.third + 1
            que.add(Triple(x, y + 1, tmp.third + 1))
        }
    }

    println(max)
}