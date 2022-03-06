import kotlin.math.max

fun next() = readLine()!!

fun main() {
    val l = next().toCharArray()

    val acgt = listOf<Char>('A', 'C', 'G', 'T')

    var max = 0
    var cnt = 0
    for (i in l) {
        if (i in acgt) {
            cnt++
        }
        else {
            max = max(cnt, max)
            cnt = 0
        }
    }
    max = max(cnt, max)

    println(max)
}