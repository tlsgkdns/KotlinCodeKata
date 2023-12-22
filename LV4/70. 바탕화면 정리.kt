class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var lux = 51; var luy = 51; var rdx = 0; var rdy = 0
        for((y, w) in wallpaper.withIndex())
        {
            for(x in 0..w.length-1)
                if(w[x] == '#')
                {
                    lux = lux.coerceAtMost(y)
                    luy = luy.coerceAtMost(x)
                    rdx = rdx.coerceAtLeast(y + 1)
                    rdy = rdy.coerceAtLeast(x + 1)
                }

        }
        answer += lux
        answer += luy
        answer += rdx
        answer += rdy
        return answer
    }
}