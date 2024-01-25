import java.util.LinkedList
import java.util.Queue

class Solution {
    val v = Array(100){IntArray(100){-1} }
    val dy = intArrayOf(-1, 1, 0, 0)
    val dx = intArrayOf(0, 0, -1, 1)
    fun solution(board: Array<String>): Int {
        var answer: Int = -1
        val q: Queue<Pair<Int, Int>> = LinkedList()
        var sPos = Pair(0, 0)
        for(r in board.indices)
            for(c in board[r].indices)
                if(board[r][c] == 'R')
                    sPos = Pair(r, c)
        v[sPos.first][sPos.second] = 0
        q.add(sPos)
        while (!q.isEmpty())
        {
            val y = q.peek().first
            val x = q.peek().second
            q.poll()
            if(board[y][x] == 'G')
            {
                answer = v[y][x]
                break
            }
            for(i in dy.indices)
            {
                var ny = y
                var nx = x
                while(ny >= 0 && nx >= 0 && ny < board.size && nx < board[0].length && board[ny][nx] != 'D')
                {
                    ny += dy[i]
                    nx += dx[i]
                }
                if(ny == y && nx == x) continue
                ny -= dy[i]; nx -= dx[i]
                if(v[ny][nx] >= 0) continue
                v[ny][nx] = v[y][x] + 1
                q.add(Pair(ny, nx))
            }
        }
        return answer
    }
}