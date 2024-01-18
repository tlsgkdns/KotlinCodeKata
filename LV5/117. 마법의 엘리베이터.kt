class Solution {
    fun dfs(n: Int, p : Int): Int
    {
        val num = (n + p)
        if(n == 0) return p
        val r = num % 10
        if(r == 0) return dfs(num / 10, 0)
        return (dfs(num / 10, 0) + r).coerceAtMost(dfs(num / 10, 1) + (10 - r))
    }
    fun solution(storey: Int): Int {
        return dfs(storey, 0)
    }
}