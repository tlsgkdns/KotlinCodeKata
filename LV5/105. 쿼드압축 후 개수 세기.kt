class Solution {
    var answer = intArrayOf(0, 0)
    fun solve(arr: Array<IntArray>, sy: Int, sx: Int, ey: Int, ex: Int)
    {
        val cmp = arr[sy][sx]
        var br = false
        for(y in sy until  ey)
        {
            if(br) break
            for(x in sx until  ex)
                if(arr[y][x] != cmp)
                {
                    br = true
                    break
                }
        }
        if(!br) ++answer[cmp]
        else
        {
            val m = (ey - sy) / 2
            solve(arr, sy, sx, sy + m, sx + m)
            solve(arr, sy, sx + m, sy + m, ex)
            solve(arr, sy + m, sx, ey, sx + m)
            solve(arr,sy + m, sx + m, ey, ex)
        }
    }
    fun solution(arr: Array<IntArray>): IntArray {
        solve(arr, 0, 0, arr.size, arr[0].size)
        return answer
    }
}