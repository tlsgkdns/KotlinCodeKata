class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        var round = (brown + 4) / 2
        for(w in 2..round)
        {
            var h = round - w
            if(w * h == brown + yellow)
            {
                answer += w.coerceAtLeast(h)
                answer += w.coerceAtMost(h)
                break
            }
        }
        return answer
    }
}