class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        citations.sort()
        var idx = 0
        for(h in 0 .. citations.last())
        {
            while(idx < citations.size && h > citations[idx]) idx++
            if(citations.size - idx >= h)
                answer = h
        }
        return answer
    }
}