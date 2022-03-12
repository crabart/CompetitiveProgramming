import java.io.PrintWriter
fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val n = nextInt()

    val ml = mutableListOf<List<Int>>()

    repeat (n) {
        ml.add(nextIntList())
    }

    val s = next()

    val arrGotoL = IntArray(200000) {-1}
    val arrGotoR = IntArray(200000) {-1}
    val listGotoL = mutableMapOf<Int, Int>()
    val listGotoR = mutableMapOf<Int, Int>()
    var arrGotoLIndex = 0
    var arrGotoRIndex = 0

    var ans = false
    bbb@ for (i in s.indices) {
        val x = ml[i][0]
        val y = ml[i][1]
        when (s[i]) {
            'L' -> {
                if (listGotoR.containsKey(y)) {
                    val tmp = arrGotoR[listGotoR[y]!!]
                    if (arrGotoR[listGotoR[y]!!] < x) {
                        ans = true
                        break@bbb
                    }
                }

                if (listGotoL.containsKey(y)) {
                    if (arrGotoL[listGotoL[y]!!] < x) {
                        arrGotoL[listGotoL[y]!!] = x
                    }
                }
                else {
                    listGotoL[y] = arrGotoLIndex
                    arrGotoL[arrGotoLIndex] = x
                    arrGotoLIndex++
                }
            }

            'R' -> {
                if (listGotoL.containsKey(y)) {
                    if (arrGotoL[listGotoL[y]!!] > x) {
                        ans = true
                        break@bbb
                    }
                }

                if (listGotoR.containsKey(y)) {
                    if (arrGotoR[listGotoR[y]!!] > x) {
                        arrGotoR[listGotoR[y]!!] = x
                    }
                }
                else {
                    listGotoR[y] = arrGotoRIndex
                    arrGotoR[arrGotoRIndex] = x
                    arrGotoRIndex++
                }
            }
        }
    }

    println(if (ans) "Yes" else "No")
}