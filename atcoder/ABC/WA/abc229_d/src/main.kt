import java.io.PrintWriter
import kotlin.math.max
import kotlin.math.min

fun next() = readLine()!!
fun nextInt() = next().toInt()

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val s = next()
    val k = nextInt()

    val ml = mutableListOf<Int>()
    for (i in s.indices) {
        if (s[i] == '.') {
            ml.add(i)
        }
    }

    val num = min(ml.size, k)

    val l = ml.combinationWithoutRepetition(num)

    var ans = 0
    for (i in l) {
        var tmpS = s.toCharArray()
        for (j in i) {
            tmpS[j] = 'X'
        }

        var isFound = false
        var cnt = 0
        for (i in tmpS.indices) {
            if (tmpS[i] == 'X') {
                isFound = true
                cnt++
            }
            else if (isFound) {
                ans = max(cnt, ans)
                isFound = false
                cnt = 0
            }
        }
        ans = max(cnt, ans)
    }

    println(ans)
}


fun next_combination() : Boolean {
    val l = listOf<Int>(0,1,2)
    val l2 = l.iterator()
    l2.
}


//template <typename T> bool next_combination(const T first, const T last, int k) {
//    const T subset = first + k;
//    // empty container | k = 0 | k == n
//    if (first == last || first == subset || last == subset) {
//        return false;
//    }
//    T src = subset;
//    while (first != src) {
//        src--;
//        if (*src < *(last - 1)) {
//            T dest = subset;
//            while (*src >= *dest) {
//            dest++;
//        }
//            iter_swap(src, dest);
//            rotate(src + 1, dest + 1, last);
//            rotate(subset, subset + (last - dest) - 1, last);
//            return true;
//        }
//    }
//    // restore
//    rotate(first, subset, last);
//    return false;
//}



private fun <T> pcSequenceFactory(
    selecteds: List<T> = emptyList(),
    filter: (options: List<T>, i: Int) -> List<T>
): (options: List<T>, k: Int) -> Sequence<List<T>> =
    { options, k ->
        sequence {
            if (k == 0) {
                yield(selecteds)
                return@sequence
            }

            options.forEachIndexed { i, option ->
                pcSequenceFactory(selecteds + option, filter).let {
                    it(filter(options, i), k - 1)
                }.forEach {
                    yield(it)
                }
            }
        }
    }

/** 重複なしの組み合わせ */
fun <T> List<T>.combinationWithoutRepetition(k: Int): Sequence<List<T>> {
    require(k in 0..size) { "引数 k は 0 以上かつ $size 以下でなければなりません。k: $k" }

    return pcSequenceFactory<T> { options, i ->
        options.drop(i + 1)
    }(this, k)
}
