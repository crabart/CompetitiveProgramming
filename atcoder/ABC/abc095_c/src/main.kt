fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

fun main() {
    val (a, b, c, x, y) = nextIntList()

    val max = Math.max(x, y)

    var cost = Int.MAX_VALUE
    for (i in 0..max) {
        val xNum = if (x - i < 0) 0 else x - i
        val yNum = if (y - i < 0) 0 else y - i
        val tmpCost = xNum * a + yNum * b + i * c * 2

        cost = Math.min(cost, tmpCost)

    }

    println(cost)
}