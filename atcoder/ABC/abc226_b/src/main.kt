import java.io.PrintWriter
import kotlin.math.ceil

fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val n = nextInt()

    val ml = mutableListOf<List<Int>>()
    val mlSum = mutableListOf<MutableList<Int>>()
    repeat(n) {
        val l = nextIntList()
        ml.add(l)
        var sum = 0

        val mlTmp = mutableListOf<Int>()
        for (i in l) {
            sum += i
            mlTmp.add(sum)
        }
        mlSum.add(mlTmp)
    }

    val set = mutableSetOf<Int>()
    var ans = 0

    for (i in 0 until ml.size - 1) {
        if (set.contains(i)) {
            continue
        }
        for (j in i + 1 until ml.size) {
            if (set.contains(j)) {
                continue
            }

            if (ml[i].size == ml[j].size) {
                var left = 0
                var res = true
                while (left < ml[i].size) {
                    val middle = ceil((ml[i].size - 1 - left) / 2.0 + left).toInt()
                    if (mlSum[i][middle] != mlSum[j][middle]) {
                        res = false
                        break
                    }
                    else {
                        left = middle + 1
                    }
                }

                if (res) {
                    set.add(j)
                    ans++
                }
            }
        }
    }

    println(n - ans)
}