fun next() = readLine()!!
fun nextLong() = next().toLong()

fun main(){
    val n = nextLong()

    if (n in -2147483648 until 2147483648){
        println("Yes")
    }
    else{
        println("No")
    }
}