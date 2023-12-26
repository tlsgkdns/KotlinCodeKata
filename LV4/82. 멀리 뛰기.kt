class Solution {

    var dp = IntArray(2001){-1}
    fun solution(n: Int): Int
    {
        if(n < 0) return 0
        if(n == 0) return 1
        if(dp[n] >= 0) return dp[n]
        dp[n] = (solution(n - 1) + solution(n - 2)) % 1234567
        return dp[n]
    }
}