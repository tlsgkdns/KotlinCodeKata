class Solution {
    val dy = intArrayOf(0, 0, 1, -1)
    val dx = intArrayOf(-1, 1, 0, 0)
    var v = Array(101){BooleanArray(101){false} }
    lateinit var m: Array<String>
    fun inRange(y: Int, x: Int, n1: Int, n2: Int): Boolean
    {
        return y >= 0 && x >= 0 && y < n1 && x < n2
    }
    fun dfs(y: Int, x: Int): Int
    {
        var s = m[y][x].code - '0'.code
        for(d in dy.indices)
        {
            val ny = dy[d] + y
            val nx = dx[d] + x
            if(!inRange(ny, nx, m.size, m[0].length) || v[ny][nx] || m[ny][nx] == 'X') continue
            v[ny][nx] = true
            s += dfs(ny, nx)
        }
        return s
    }
    fun solution(maps: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        m = maps
        for(i in maps.indices)
            for(j in maps[i].indices)
                if(maps[i][j] != 'X' && !v[i][j])
                {
                    v[i][j] = true
                    answer += dfs(i, j)
                }
        if(answer.isEmpty()) answer += -1
        answer.sort()
        return answer
    }
}