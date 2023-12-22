class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var rank: IntArray = intArrayOf()
        for(i in 0 .. score.size - 1)
        {
            rank += (score[i])
            rank.sort()
            if(i < k) answer += (rank[0])
            else answer += (rank[i - k + 1])
        }
        return answer
    }
}