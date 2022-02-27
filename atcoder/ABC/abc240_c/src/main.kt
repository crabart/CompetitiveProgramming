fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

fun main() {
    val (n, x) = nextIntList()

    val arr = Array(x + 101) { BooleanArray(x + 101) }

    val ml = mutableListOf<Pair<Int, Int>>()
    for (i in 1..n) {
        val (a, b) = nextIntList()
        ml.add(a to b)
    }

    arr[0][0] = true

    for (i in 0 until n) {
        val (a, b) = ml[i]
        for (j in 0..x) {
            if (arr[i][j]) {
                arr[i + 1][j + a] = true
                arr[i + 1][j + b] = true
            }
        }
    }

    if (arr[n][x]) {
        println("Yes")
    }
    else {
        println("No")
    }
}