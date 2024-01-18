import kotlin.math.sqrt

class Solution {
    fun solution(k: Int, d: Int): Long {
        var answer: Long = 0
        val dd = d.toLong() * d.toLong()
        var y = 0L
        while(y <= d)
        {
            answer += ((sqrt((dd - (y * y)).toDouble()).toLong() / k)) + 1;
            y += k
        }
        return answer
    }
}