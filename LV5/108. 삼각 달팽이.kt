class Solution {
    val g = Array(1000){IntArray(1000)}
    var cnt = 0
    fun solution(n: Int): IntArray {
        var answer = IntArray((1..n).sum())
        var (s, y, x, idx) = intArrayOf(n, 0, 0, 0)
        while (s > 0)
        {
            if(s == 1)
            {
                g[y][x] = cnt + 1
                break
            }
            for(i in 0 until s) g[y + i][x] = ++cnt
            for(i in 1 until s) g[y + s - 1][x + i] = ++cnt
            for(i in 1 until s - 1) g[y + s - 1 - i][x + s - 1 - i] = ++cnt
            y += 2; x += 1; s -= 3;
        }

        for(i in 0 until n)
        {
            for(j in (0 .. i))
                answer[idx++] = g[i][j]
        }
        return answer
    }
}