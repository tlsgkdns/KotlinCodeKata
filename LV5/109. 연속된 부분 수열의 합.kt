class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var (l, r, s) = intArrayOf(0, 0, sequence[0])
        while(true)
        {
            if(s == k)
            {
                if(answer.isEmpty() || (answer[1] - answer[0] > r - l))
                {
                    answer = intArrayOf(l, r)
                }
                s -= sequence[l++]
            }
            else if(s > k)
            {
                s -= sequence[l++]
            }
            else
            {
                if(r >= sequence.size - 1) break
                s += sequence[++r]
            }
        }
        return answer
    }
}