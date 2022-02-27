fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

fun main(){
    val (h, w) = nextIntList()

    val ml = mutableListOf<List<Int>>()
    for (i in 0 until h){
        val tmp = nextIntList()
        ml.add(tmp)
    }

    val ans = mutableListOf<MutableList<Int>>()

    for (i in 0 until w){
        var tmp = mutableListOf<Int>()
        for (j in 0 until h){
            tmp.add(ml[j][i])
        }
        ans.add(tmp)
    }

    for (i in 0 until w){
        for (j in 0 until h - 1){
            print("${ans[i][j]} ")
        }
        println("${ans[i][h-1]}")
    }
}