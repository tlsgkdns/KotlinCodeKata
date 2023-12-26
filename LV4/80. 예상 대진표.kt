import kotlin.math.log2


class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        if(b < a) return solution(n, b, a)
        val m = n / 2
        if(m in a until b) return log2(m.toDouble()).toInt() + 1
        if(a > m) return solution(m, a - m, b - m)
        return solution(m, a, b)
    }
}