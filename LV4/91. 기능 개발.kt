import kotlin.math.ceil
class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        var p = -1; var s = 0
        for(i in progresses.indices)
        {
            val r = ceil((100 - progresses[i]).toFloat() / speeds[i].toFloat())
            if(p < 0)
            {
                p = r.toInt()
                ++s
                continue
            }
            if(p >= r)
                ++s
            else
            {
                answer += s
                p = r.toInt()
                s = 1
            }
        }
        answer += s
        return answer
    }
}