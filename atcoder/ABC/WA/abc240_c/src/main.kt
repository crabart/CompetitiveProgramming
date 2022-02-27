fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }
//
//fun solve(ml : MutableList<Pair<Int, Int>>, n : Int, cnt : Int, x: Int) : Boolean {
//    var result = false
//
//    if (cnt == ml.size) {
//        return x == n
//    }
//    else {
//        if (!result) {
//            result = solve(ml, n + ml[cnt].first, cnt + 1, x)
//        }
//
//        if (!result) {
//            result = solve(ml, n + ml[cnt].second, cnt + 1, x)
//        }
//    }
//
//    return result
//}
//
//fun main() {
//    val (n, x) = nextIntList()
//
//    val ml = mutableListOf<Pair<Int, Int>>()
//    for (i in 1..n) {
//        val (a, b) = nextIntList()
//        ml.add(a to b)
//    }
//
//    val ans = solve(ml, 0, 0, x)
//
//    if (ans) {
//        println("Yes")
//    }
//    else {
//        println("No")
//    }
//}

fun main() {
    val (n, x) = nextIntList()

    val ml = mutableListOf<Pair<Int, Int>>()
    for (i in 1..n) {
        val (a, b) = nextIntList()
        ml.add(a to b)
    }

    var end = 1

    for (i in 1..n) {
        end *= 2
    }

    var ans = false
    for (i in 0 until end) {
        var sum = 0
        for (j in 0 until n) {
            sum += if ((i shr j) and 1 == 1) {
                ml[j].first
            } else {
                ml[j].second
            }
        }

        if (sum == x) {
            ans = true
            break
        }
    }

    if (ans) {
        println("Yes")
    }
    else {
        println("No")
    }
}