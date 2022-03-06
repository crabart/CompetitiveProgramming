fun next() = readLine()!!
fun nextInt() = next().toInt()

fun fx(x : Int) : Int {
    return x * x + 2 * x + 3
}

fun main() {
    val x = nextInt()

    println(fx(fx(fx(x) + x) +fx(fx(x))))
}