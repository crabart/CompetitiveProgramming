fun next() = readLine()!!
fun nextLong() = next().toLong()

fun main() {
    var n = nextLong()

    if (n < 0 && n % 10 != 0L) {
        n -= 10
    }

    println(n / 10)
}