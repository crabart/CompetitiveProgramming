fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

fun main() {
    val (n, q) = nextIntList()
    val a = nextIntList()

    val ml = mutableListOf<List<Int>>()
    for (i in 1..q) {
        val l = nextIntList()
        ml.add(l)
    }

    for (i in ml) {
        var cnt = 0
        var ans = 0
        for (j in a) {
            if (j == i[0]) {
                cnt++
            }
            ans++
            if (cnt == i[1]) {
                break
            }
        }

        println(if (cnt == i[1]) ans else -1)
    }
}