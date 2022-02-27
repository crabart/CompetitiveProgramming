fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

fun main() {
    val (n, m) = nextIntList()
    val la = nextIntList().toMutableList()
    val lb = nextIntList()

    var res = true
    for (i in lb) {
        val f = la.remove(i)
        if (!f) {
            res = false
            break
        }
    }

    if (res) {
        println("Yes")
    }
    else {
        println("No")
    }
}