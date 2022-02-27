fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

fun main() {
    val l = nextIntList()

    println(l[l[l[0]]])
}