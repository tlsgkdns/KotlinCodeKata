class Solution {
    val v = Array(501){Array(501){BooleanArray(4){false} } }
    val dy = intArrayOf(1, 0, -1, 0)
    val dx = intArrayOf(0, 1, 0, -1)
    var n = 0
    var m = 0
    fun solution(grid: Array<String>): IntArray {
        var answer = IntArray(250001){1000000007}
        n = grid.size; m = grid[0].length
        var idx = 0
        for(i in grid.indices)
            for(j in grid[i].indices)
                for(d in 0..3)
                    if(!v[i][j][d])
                    {
                        var y = i; var x = j; var dir = d
                        var cnt = 0
                        while(!v[y][x][dir])
                        {
                            v[y][x][dir] = true
                            if(grid[y][x] == 'L') dir = (dir + 1) % 4
                            else if(grid[y][x] == 'R') dir = ((dir - 1) + 4) % 4
                            y += dy[dir]
                            x += dx[dir]
                            if(y == grid.size) y = 0
                            if(x == grid[0].length) x = 0
                            if(y < 0) y = n - 1
                            if(x < 0) x = m - 1
                            ++cnt
                        }
                        answer[idx++] = cnt
                    }
        answer.sort()
        return answer.copyOfRange(0, idx)
    }
}