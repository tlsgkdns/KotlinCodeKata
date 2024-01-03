class Solution {
    fun solution(numbers: LongArray): LongArray {
        var answer: LongArray = longArrayOf()
        for(n in numbers)
        {
            var d = 1L
            while(d <= n && (n or d) == n)
            {
                d = d shl 1
            }
            answer += if(d > 1)
                (n + (d shr 1))
            else
                n.or(d)

        }
        return answer
    }
}