import java.io.PrintWriter
fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (n, m) = nextIntList()

    var ans = true
    val mMap = mutableMapOf<Int, Int>()

    val ml = mutableListOf<Pair<Int, Int>>()
    for (i in 0 until m) {
        val ab = nextIntList()

        for (j in ab) {
            if (!mMap.containsKey(j)) {
                mMap[j] = 1
            }
            else {
                mMap[j] = mMap[j]!! + 1

                if (mMap[j]!! > 2) {
                    ans = false
                    break
                }
            }
        }

        ml.add(ab[0] to ab[1])
        ml.add(ab[1] to ab[0])
    }

//    if (mMap.filter { it.value == 1 }.count() != 2) {
//        ans = false
//    }

    var arr = BooleanArray(n) {false}
    if (ans) {
        for (i in 0 until n) {
            if (!arr[i]) {

            }
        }
    }

    println(if (ans) "Yes" else "No")
}