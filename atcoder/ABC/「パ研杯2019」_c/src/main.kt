import kotlin.math.max

fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }
fun nextLongList() = next().split(" ").map{ it.toLong() }

fun main() {
    val (n, m) = nextIntList()

    val ml = mutableListOf<List<Long>>()
    for (i in 1..n) {
        ml.add(nextLongList())
    }

    var maxScore = 0L
    for (i in 0 until m-1) {
        for (j in i + 1 until m) {
            var score = 0L

            for (k in 0 until n) {
                score += max(ml[k][i], ml[k][j])
            }

            maxScore = max(maxScore, score)
        }
    }

    println(maxScore)
}