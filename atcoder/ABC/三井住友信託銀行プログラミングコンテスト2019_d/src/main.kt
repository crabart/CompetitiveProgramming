fun next() = readLine()!!

fun main() {
    next()
    val s = next()

    var ans = 0

    for (i in 0..999) {
        val hundred = i / 100
        val ten = i / 10 % 10
        val one = i % 10

        val l = listOf(hundred, ten, one)

        var cnt = -1
        var beforeCnt = cnt
        var isOK = true

        for (k in l) {
            for (j in cnt + 1 until s.length) {
                if (k.toString()[0] == s[j]) {
                    cnt = j
                    break
                }
            }

            if (cnt == beforeCnt) {
                isOK = false
                break
            }

            beforeCnt = cnt
        }

        if (isOK) {
            ans++
        }
    }

    println(ans)
}