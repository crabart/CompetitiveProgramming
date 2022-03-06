fun next() = readLine()!!
fun nextLong() = next().toLong()

fun main() {
    var k = nextLong()

    var i = 1L
    var ans = ""
    while (k != 0L) {
        if (k and 1L == 1L) {
            ans = 2L.toString() + ans
        }
        else {
            ans = 0L.toString() + ans
        }
        i *= 10
        k = k shr 1
    }

    println(ans)
}