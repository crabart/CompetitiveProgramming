import java.io.PrintWriter
fun next() = readLine()!!
fun nextInt() = next().toInt()

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val n = nextInt()

    val m = mutableMapOf<String, Int>()

    repeat(n) {
        val name = next()

        if (m.containsKey(name)) {
            m[name] = m[name]!! + 1
        }
        else {
            m[name] = 1
        }
    }

    //println(m.maxByOrNull { it.value }!!.key)
    println(m.maxBy { it.value }!!.key)
}