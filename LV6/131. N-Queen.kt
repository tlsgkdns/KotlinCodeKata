import kotlin.math.abs

class Solution {
    val col = IntArray(13){-1}
    fun solve(idx: Int, n: Int): Int
    {
        if(idx > n)
        {
            return 1
        }
        var ret = 0
        for(num in 1 .. n)
        {
            var f = true
            for(i in 1 until idx)
                if(col[i] == num || abs(idx - i) == abs(num - col[i]))
                {
                    f = false
                    break
                }
            if(!f) continue
            col[idx] = num
            ret += solve(idx + 1, n)
            col[idx] = -1
        }
        return ret
    }
    fun solution(n: Int): Int {

        return solve(1, n)
    }
}