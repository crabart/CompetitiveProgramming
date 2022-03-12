import java.io.PrintWriter
import java.util.PriorityQueue

fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLongList() = next().split(" ").map{ it.toLong() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val n = nextInt()

    val ml = mutableListOf<List<Long>>()
    repeat(n) {
        ml.add(nextLongList())
    }

    val queNeedSkill = PriorityQueue<Int>() { i1, i2 ->
        return@PriorityQueue i2.compareTo(i1)
    }
    var set = mutableSetOf<Int>()

    var sum = 0L
    queNeedSkill.add(ml.size - 1)
    set.add(ml.size - 1)
    while (queNeedSkill.isNotEmpty()) {
        val tmp = queNeedSkill.poll()
        for (i in 0 until ml[tmp][1]) {
            val needSkill = ml[tmp][2 + i.toInt()].toInt() - 1
            if (!set.contains(needSkill)) {
                queNeedSkill.add(needSkill)
                set.add(needSkill)
            }
        }
        sum += ml[tmp][0]
    }

    println(sum)
}
