import kotlin.math.pow


class Solution {
    fun solve(l: Long, r: Long, idx1: Long, idx2: Long, cnt: Long): Long
    {
        if(idx1 > r || idx2 < l) return 0
        if(cnt == 0L || (l == idx1 && r == idx2) || idx1 == idx2) return cnt
        val length = (idx2 - idx1 + 1) / 5
        var ret = 0L
        for(i in 1 .. 5)
        {
            ret += solve(l, r, idx1 + length * (i - 1), idx1 + length * i - 1, if(i == 3) 0 else cnt / 4)
        }
        return ret
    }
    fun solution(n: Int, l: Long, r: Long): Int {
        val idx1 = 0L
        val idx2 = (5.0.pow(n.toDouble()) - 1).toLong()
        var answer = solve(l - 1, r - 1, idx1, idx2, 4.0.pow(n.toDouble()).toLong()).toInt()
        return answer
    }
}