class Solution {
    var m = mutableMapOf<Int, Int>()
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        for(t in tangerine) m[t] = (m[t] ?: 0) + 1
        var s = 0
        for((idx, v) in m.values.sortedByDescending { it }.withIndex())
        {
            s += v
            if(s >= k)
            {
                answer = idx + 1
                break
            }
        }
        return answer
    }
}