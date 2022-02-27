fun next() = readLine()!!
fun nextLongList() = next().split(" ").map{ it.toLong() }

fun main() {
    var (x1, y1, x2, y2) = nextLongList()

    var ans = false
    for (i in x1 - 5..x1 + 5) {
        for (j in y1 - 5..y1 + 5) {
            val z1 = (x1 - i) * (x1 - i) + (y1 - j) * (y1 - j)
            val z2 = (x2 - i) * (x2 - i) + (y2 - j) * (y2 - j)

            if (z1 == 5L && z2 == 5L) {
                ans = true
                break
            }
        }
    }

    if (ans) {
        println("Yes")
    }
    else {
        println("No")
    }
}