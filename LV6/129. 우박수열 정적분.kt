import kotlin.math.abs

class Solution {
    fun solution(k: Int, ranges: Array<IntArray>): DoubleArray {
        var point = intArrayOf(k)
        var area = doubleArrayOf(0.0)
        var answer = doubleArrayOf()
        var tmp = k
        while (tmp > 1)
        {
            if(tmp % 2 > 0) tmp = tmp * 3 + 1
            else tmp /= 2
            point += tmp
        }
        for(i in 0 until point.size - 1)
            area += (area.last() + point[i].coerceAtMost(point[i + 1]).toDouble() + ((abs(point[i] - point[i + 1]).toDouble() / 2)))
        for(r in ranges)
        {
            val s = r[0]
            val e = if(r[1] <= 0) point.size + r[1] - 1 else r[1]
            if(s > e) answer += -1.0
            else answer += (area[e] - area[s])
        }
        return answer
    }
}