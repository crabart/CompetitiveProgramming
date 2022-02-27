fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextList() = next().split(" ")
fun nextIntList() = next().split(" ").map{ it.toInt() }
fun nextLongList() = next().split(" ").map{ it.toLong() }
fun nextDoubleList() = next().split(" ").map{ it.toDouble() }

fun main(){
    val n = nextInt()

    if (n == 1){
        print("Yes")
    }
    else if (n in 2..4){
        print("No")
    }
    else{
        print("Yes")
    }
}
