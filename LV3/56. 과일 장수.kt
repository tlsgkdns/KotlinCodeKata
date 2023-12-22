class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        var tmp = score; var idx = tmp.size - 1
        tmp.sort()
        while(idx - m + 1 >= 0)
        {
            answer += (score[idx - m + 1] * m)
            idx -= m
        }
        return answer
    }
}