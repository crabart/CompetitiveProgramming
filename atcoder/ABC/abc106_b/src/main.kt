fun next() = readLine()!!
fun nextInt() = next().toInt()

fun main() {
    val n = nextInt()

    if (n < 105) {
        println(0)
    }
    else {
        var ans = 0
        for (i in 105..n step 2) {
            var cnt = 0
            for (j in 1..n) {
                if (i % j == 0) {
                    cnt++
                }
            }

            if (cnt == 8) {
                ans++
            }
        }

        println(ans)
    }
}