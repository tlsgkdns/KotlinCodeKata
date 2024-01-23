import java.util.LinkedList
import java.util.Queue

class Solution {
    val dy = intArrayOf(1, -1, 0, 0)
    val dx = intArrayOf(0, 0, -1, 1)
    fun inRange(y: Int, x : Int, r: Int, c: Int): Boolean
    {
        return y >= 0 && x >= 0 && y < r && x < c
    }
    fun solution(maps: Array<String>): Int {
        val v = Array(maps.size){Array(maps[0].length){IntArray(2){-1} } }
        val q: Queue<IntArray> = LinkedList()
        for(i in maps.indices)
            for(j in maps[i].indices)
                if(maps[i][j] == 'S')
                {
                    q.add(intArrayOf(i, j, 0))
                    v[i][j][0] = 0
                }
        var answer = -1
        while(!q.isEmpty())
        {
            val y = q.peek()[0]
            val x = q.peek()[1]
            val lev = q.peek()[2]
            q.poll()
            if(maps[y][x] == 'E' && lev == 1)
            {
                answer = v[y][x][lev]
                break
            }
            for(d in 0 .. 3)
            {
                val ny = y + dy[d]
                val nx = x + dx[d]
                var nl = lev
                if(!inRange(ny, nx, maps.size, maps[0].length) || maps[ny][nx] == 'X') continue
                if(maps[ny][nx] == 'L') nl = 1
                if(v[ny][nx][nl] >= 0) continue
                v[ny][nx][nl] = v[y][x][lev] + 1
                q.add(intArrayOf(ny, nx, nl))
            }
        }
        return answer
    }
}