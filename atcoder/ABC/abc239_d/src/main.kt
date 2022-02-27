import kotlin.math.*

fun next() = readLine()!!
fun nextLongList() = next().split(" ").map{ it.toLong() }

fun isPrime(x : Long) : Boolean {
    val sqrtX = sqrt(x.toDouble()).toLong()
    for (i in 2..sqrtX) {
        if (x % i == 0L){
            return false
        }
    }

    return true
}

fun main() {
    var (a, b, c, d) = nextLongList()

    var ans = true

    for (i in a..b){
        var tmp = false
        for (j in c..d){
            if (isPrime(i + j)) {
                tmp = true
                break
            }
        }
        if (!tmp) {
            ans = false
            break
        }
    }

    if (ans) {
        println("Aoki")
    }
    else {
        println("Takahashi")
    }
}