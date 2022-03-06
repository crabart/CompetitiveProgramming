fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextIntList() = next().split(" ").map{ it.toInt() }

fun main() {
    val n = nextInt()
    val h = nextIntList()

    var ans = h[0]
    for (i in 0 until n - 1) {
        if (h[i] < h[i + 1]) {
            ans = h[i + 1]
        }
        else {
            break
        }
    }

    println(ans)
}