import java.io.PrintWriter
fun next() = readLine()!!

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val s = next()

    var ans = true
    var first = true
    var cnt = 0
    for (i in s.indices) {
        if (s[i] == 'x') {
            cnt++

            if (cnt > 2) {
                ans = false
                break
            }
        }
        else {
            if (((cnt == 0 || cnt == 1) && first) || cnt == 2) {
                cnt = 0
                first = false
            }
            else {
                ans = false
                break
            }
        }
    }

    println(if (ans) "Yes" else "No")
}