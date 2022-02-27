fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextIntList() = next().split(" ").map{ it.toInt() }

fun main(){
    val n = nextInt()
    val l = nextIntList()

    var ml = mutableListOf<Int>()
    for(i in 0 until n){
        ml.add(0)
    }

    for (element in l){
        ml[element - 1]++
    }

    for (i in 0 until n){
        if (ml[i] == 3){
            println(i + 1)
            break
        }
    }
}