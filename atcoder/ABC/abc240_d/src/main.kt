fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextIntList() = next().split(" ").map{ it.toInt() }

@kotlin.ExperimentalStdlibApi
fun main() {
    val n = nextInt()
    val l = nextIntList()

    var ml = mutableListOf<MutablePair<Int, Int>>()

    var stackNum = 0
    for (i in l) {
        if (ml.isEmpty()) {
            ml.add(MutablePair(i, 1))
            stackNum = 1
        }
        else if (ml.last().first == i){
            ml.last().second++
            stackNum++

            if (ml.last().second >= i) {
                ml.removeLast()
                stackNum -= i
            }
        }
        else {
            ml.add(MutablePair(i, 1))
            stackNum++
        }

        println(stackNum)
    }
}

class MutablePair<T, U>(var first: T, var second: U) {
    fun add(a : T, b: U){
        first = a
        second = b
    }
}