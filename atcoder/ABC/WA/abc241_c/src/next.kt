fun next() = readLine()!!
fun nextInt() = next().toInt()

fun main() {
    val n = nextInt()

    val arr = Array(n) { CharArray(n) }
    for (i in 0 until n) {
        val tmp = next().toCharArray()
        for (j in tmp.indices) {
            arr[i][j] = tmp[j]
        }
    }

    var ans = false
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (arr[i][j] == '#') {
                var cntH = 0
                ans = true
                for (k in 1..5) {
                    if (j + k >= n) {
                        ans = false
                        break
                    }
                    if (arr[i][j + k] == '.') {
                        cntH++
                    }

                    if (cntH > 2) {
                        ans = false
                        break
                    }
                }

                if (ans) {
                    break
                }

                var cntV = 0
                ans = true
                for (k in 1..5) {
                    if (i + k >= n) {
                        ans = false
                        break
                    }
                    if (arr[i + k][j] == '.') {
                        cntV++
                    }

                    if (cntV > 2) {
                        ans = false
                        break
                    }
                }

                if (ans) {
                    break
                }


                var cnt = 0
                ans = true
                for (k in 1..5) {
                    if (i + k >= n || j + k >= n) {
                        ans = false
                        break
                    }
                    if (arr[i + k][j + k] == '.') {
                        cnt++
                    }

                    if (cnt > 2) {
                        ans = false
                        break
                    }
                }

                if (ans) {
                    break
                }

                var cnt2 = 0
                ans = true
                for (k in 1..5) {
                    if (i + k >= n || j - k < 0) {
                        ans = false
                        break
                    }
                    if (arr[i + k][j - k] == '.') {
                        cnt2++
                    }

                    if (cnt2 > 2) {
                        ans = false
                        break
                    }
                }

                if (ans) {
                    break
                }
            }
            if (ans) {
                break
            }
        }
        if (ans) {
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