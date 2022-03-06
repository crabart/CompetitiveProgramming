import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor

fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

//fun main() {
//    val (n, k) = nextIntList()
//
//    val p = nextIntList()
//
//    val s = sortedSetOf<Int>()
//
//    for (i in 0 until n) {
//        s.add(p[i])
//        if (i >= k - 1) {
//            println(s.elementAt(i - (k - 1)))
//        }
//    }
//}

//fun main() {
//    val (n, k) = nextIntList()
//
//    val p = nextIntList()
//
//    val s = mutableListOf<Int>()
//
//    for (i in 0 until n) {
//        if (s.isEmpty()) {
//            s.add(p[i])
//        }
//        else {
//            var left = 0
//            var right = s.size - 1
//
//            while (true) {
//                if (abs(left - right) < 2) {
//                    break
//                }
//
//                val tmpIndex = floor((left + right) / 2.0).toInt()
//
//                if (p[i] > p[tmpIndex]) {
//                    right = tmpIndex
//                }
//                else {
//                    left = tmpIndex
//                }
//            }
//
//            if (p[left] > p[i]) {
//                s.add(left, p[i])
//            }
//            else {
//                if (left == right) {
//                    s.add(right + 1, p[i])
//                }
//                else {
//                    s.add(right, p[i])
//                }
//            }
//        }
//
//        if (i >= k - 1) {
//            println(s[i - (k - 1)])
//        }
//    }
//}

fun main() {
    val (n, k) = nextIntList()

    val p = nextIntList()

    val s = sortedSetOf<Int>()

    var num = -1
    for (i in 0 until n) {
        s.add(p[i])
        if (i >= k - 1) {
            if (num == -1 || p[i] > num) {
                num = s.elementAt(i - (k - 1))
            }
            println(num)
        }
    }
}
