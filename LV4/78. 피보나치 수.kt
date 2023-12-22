class Solution {
    var dp = IntArray(100001){-1}

    fun solution(n: Int): Int {
        dp[0] = 0; dp[1] = 1
        for(i in 2..n)
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567
        return dp[n]
    }
}