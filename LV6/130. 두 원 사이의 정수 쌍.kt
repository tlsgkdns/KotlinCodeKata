import kotlin.math.*

class Solution {
    fun solution(r1: Int, r2: Int): Long {
        var ans = (r2.toLong() - r1.toLong() + 1) * 4L
        for(r in 1L until r2.toLong()) ans += 4 * floor(sqrt(r2.toDouble() * r2.toDouble() - r.toDouble() * r.toDouble())).toLong()
        for(r in 1L until r1.toLong())
        {
            ans -= 4L * floor(sqrt(r1.toDouble() * r1 - r * r)).toLong()
            if(Math.pow(floor(sqrt(r1.toDouble() * r1 - r * r)), 2.0) + Math.pow(r.toDouble(), 2.0) == Math.pow(r1.toDouble(), 2.0))
                ans += 4L
        }
        return ans
    }
}