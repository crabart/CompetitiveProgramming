import java.io.PrintWriter
fun next() = readLine()!!
fun nextIntList() = next().split(" ").map{ it.toInt() }

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {

    val (n, q) = nextIntList()

    val list = mutableListOf<MutableList<Int>>()
    repeat (n) {
        list.add(mutableListOf(it + 1))
    }

    repeat (q) {
        val query = nextIntList()

        when (query[0]) {
            1 -> {
                var front = -1
                var end = -1
                for (i in list.indices) {
                    if (list[i].isNotEmpty() && list[i].last() == query[1]) {
                        front = i
                    }

                    if (list[i].isNotEmpty() && list[i].first() == query[2]) {
                        end = i
                    }

                    if (front != -1 && end != -1) {
                        break
                    }
                }
                list[front].addAll(list[end])
                list.removeAt(end)
            }

            2 -> {
                var front = 0
                for (i in list.indices) {
                    if (list[i].contains(query[1])) {
                        front = i
                        break
                    }
                }

                val sub = list[front].subList(list[front].indexOf(query[2]), list[front].size)
                val tmp = mutableListOf<Int>()
                for (i in sub) {
                    tmp.add(i)
                }
                list[front].removeAll(sub)
                list.add(tmp)
            }

            3 -> {
                for (i in list) {
                    if (i.contains(query[1])) {
                        print(i.size)

                        print(" ")

                        println(i.toString().removeSurrounding("[", "]").replace(",", ""))
                        break
                    }
                }
            }
        }
    }
}