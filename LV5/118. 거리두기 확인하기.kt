class Solution {
    lateinit var m: Array<Array<String>>
    var v = Array<Array<Boolean>>(5){Array<Boolean>(5){false}}
    val dy = arrayOf(-1, 1, 0, 0)
    val dx = arrayOf(0, 0, -1, 1)
    fun inRange(y: Int, x: Int): Boolean = (y < 5 && x < 5 && y >= 0 && x >= 0)
    fun dfs(idx: Int, y: Int, x: Int, d: Int): Boolean
    {
        if(d == 2) return true
        for(i in 0..3)
        {
            val ny = y + dy[i]
            val nx = x + dx[i]
            if(!inRange(ny, nx) || m[idx][ny][nx] == 'X' || v[ny][nx]) continue
            v[ny][nx] = true
            if(m[idx][ny][nx] == 'P' || !dfs(idx, ny, nx, d + 1)) return false
        }
        return true
    }
    fun solution(places: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        m = places
        for(i in places.indices)
        {
            var r = 1
            for(y in places[i].indices)
                for(x in places[i][y].indices)
                    if(places[i][y][x] == 'P')
                    {
                        v = Array<Array<Boolean>>(5){Array<Boolean>(5){false}}
                        v[y][x] = true
                        if(!dfs(i, y, x, 0))
                        {
                            r = 0
                            break
                        }
                    }
            answer += r
        }
        return answer
    }
}