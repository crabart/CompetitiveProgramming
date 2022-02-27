import kotlin.math.sqrt

fun next() = readLine()!!
fun nextLong() = next().toLong()

fun main() {
    val n = nextLong()

    val ans = sqrt((12800000 * n + n * n).toDouble())

    println(ans)
}