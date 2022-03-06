fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextList() = next().split(" ")
fun nextIntList() = next().split(" ").map{ it.toInt() }
fun nextLongList() = next().split(" ").map{ it.toLong() }
fun nextDoubleList() = next().split(" ").map{ it.toDouble() }

//fun main() {
//    val (a, n) = nextLongList()
//
//    // query, num, step
//    val queue = ArrayDeque<Triple<Long, Long, Long>>()
//
//    queue.add(Triple(0L, 1L, 1L))
//
//    var step = 1L
//    var ans = Triple(0L, 0L, -1L)
//    var query1over = false
//    var query2over = false
//    while(queue.isNotEmpty()) {
//
//        val tmp = queue.removeFirst()
//
//        if (query1over && query2over && step <= tmp.third) {
//            break
//        }
//
//        if (tmp.second == n) {
//            ans = tmp
//            break
//        }
//
//        if (step == tmp.third) {
//            step++
//        }
//
//        when (tmp.first) {
//            0L -> {
//                queue.add(Triple(1, tmp.second * a, step))
//            }
//
//            1L -> {
//                if (tmp.second * a > n) {
//                    query1over = true
//                }
//                queue.add(Triple(1, tmp.second * a, step))
//
//                if (tmp.second >= 10L && tmp.second % 10L != 0L) {
//                    val bottom = (tmp.second / 10).toString()
//                    val top = (tmp.second % 10).toString()
//                    val next = (top + bottom).toLong()
//                    if (next > n) {
//                        query2over = true
//                    }
//                    queue.add(Triple(2L, next, step))
//                }
//            }
//
//            2L -> {
//                if (tmp.second * a > n) {
//                    query1over = true
//                }
//
//                queue.add(Triple(1, tmp.second * a, step))
//
//                if (tmp.second >= 10L && tmp.second % 10L != 0L) {
//                    val bottom = (tmp.second / 10).toString()
//                    val top = (tmp.second % 10).toString()
//                    val next = (top + bottom).toLong()
//                    if (next > n) {
//                        query2over = true
//                    }
//
//                    queue.add(Triple(2, next, step))
//                }
//            }
//        }
//    }
//
//    println(ans.third - 1)
//}

//fun main() {
//    val (a, n) = nextLongList()
//
//    // query, num, step
//    val queue = ArrayDeque<Pair<Long, Long>>()
//
//    queue.add(1L to 1L)
//
//    var step = 1L
//    var ans = 0L to -1L
//    var query1over = false
//    var query2over = false
//    while(queue.isNotEmpty()) {
//
//        val tmp = queue.removeFirst()
//
////        if (query1over && query2over && step <= tmp.second) {
////            break
////        }
//
////        var isFail = true
////
////        for (i in queue) {
////            if (i.first <= n) {
////                isFail = false
////            }
////        }
////
////        if (tmp.first <= n) {
////            isFail = false
////        }
////
////        if (isFail) {
////            break
////        }
//
//        if (tmp.first == n) {
//            ans = tmp
//            break
//        }
//
//        if (step == tmp.second) {
//            step++
//        }
//
//        if (tmp.first * a > n) {
//            query1over = true
//        }
//        queue.add(tmp.first * a to step)
//
//        if (tmp.first >= 10L && tmp.first % 10L != 0L) {
//            val bottom = (tmp.first / 10).toString()
//            val top = (tmp.first % 10).toString()
//            val next = (top + bottom).toLong()
//            if (next > n) {
//                query2over = true
//            }
//            queue.add(next to step)
//        }
//    }
//
//    println(ans.second - 1)
//}

fun main() {
    val (a, n) = nextIntList()

    val arr = Array<Int>(n + 1) { -1 }

    arr[0] = 1

    for (i in 0..n) {
        if (arr[i] != -1) {
            if (arr[i] * a <= n) {
                arr[arr[i] * a] = arr[i] * a
            }

            if (arr[i] >= 10 && arr[i] % 10 != 0) {
                val bottom = (arr[i] / 10).toString()
                val top = (arr[i] % 10).toString()
                val next = (top + bottom).toInt()
                if (next <= n) {
                    arr[next] = next
                }
            }
        }
    }

    println(if (arr[n] == n) n else -1)
}