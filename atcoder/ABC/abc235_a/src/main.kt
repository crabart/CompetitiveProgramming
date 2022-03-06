fun next() = readLine()!!
fun nextInt() = next().toInt()

fun main() {
    val n = nextInt()
    val a = n / 100
    val b = n / 10 % 10
    val c = n % 10

    val ans = (a * 100 + b * 10 + c) + (b * 100 + c * 10 + a) + (c * 100 + a * 10 + b)
    println(ans)
}