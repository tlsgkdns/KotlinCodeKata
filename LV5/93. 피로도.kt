class Solution {
    val v = BooleanArray(10)
    var ans = 0
    fun solve(dungeons: Array<IntArray>, f: Int, s: Int)
    {
        if(s > ans) ans = s
        for((idx, d) in dungeons.withIndex())
        {
            if(f < d[0] || v[idx]) continue
            v[idx] = true
            solve(dungeons, f - d[1], s + 1)
            v[idx] = false
        }
    }
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        solve(dungeons, k, 0)
        return ans
    }
}