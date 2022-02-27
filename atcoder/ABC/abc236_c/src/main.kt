fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextList() = next().split(" ")
fun nextIntList() = next().split(" ").map{ it.toInt() }
fun nextLongList() = next().split(" ").map{ it.toLong() }
fun nextDoubleList() = next().split(" ").map{ it.toDouble() }

fun main(){
    val (n, m) = nextIntList()

    val sn = nextList()
    val sm = nextList()

    var mCount = 0
    for (i in 0 until n){
        if (sn[i] == sm[mCount]){
            println("Yes")
            mCount++
        }
        else{
            println("No")
        }
    }
}