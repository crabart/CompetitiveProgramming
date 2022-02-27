fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

fun main(){
    val s = next()
    val (a, b) = nextIntList()

    var s2 = s

    s2 = s2.replaceRange(a-1..a-1, s[b-1].toString())
    s2 = s2.replaceRange(b-1..b-1, s[a-1].toString())

    println(s2)
}