class Solution {
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): IntArray {
        val grid = Array(rows){ IntArray(columns) }
        val answer = IntArray(queries.size)
        for(i in grid.indices)
            for(j in grid[i].indices)
                grid[i][j] = i * columns + j + 1
        for((idx, q) in queries.withIndex()) {
            var p = grid[q[0] - 1][q[1] - 1]
            var m = p
            for (x in q[1] until q[3]) {
                val tmp = grid[q[0] - 1][x]
                grid[q[0] - 1][x] = p
                p = tmp
                m = m.coerceAtMost(p)
            }
            for (y in q[0] until q[2]) {
                val tmp = grid[y][q[3] - 1]
                grid[y][q[3] - 1] = p
                p = tmp
                m = m.coerceAtMost(p)
            }
            for (x in q[3] - 2 downTo q[1] - 1) {
                val tmp = grid[q[2] - 1][x]
                grid[q[2] - 1][x] = p
                p = tmp
                m = m.coerceAtMost(p)
            }
            for (y in q[2] - 2 downTo q[0] - 1) {
                val tmp = grid[y][q[1] - 1]
                grid[y][q[1] - 1] = p
                p = tmp
                m = m.coerceAtMost(p)
            }
            answer[idx] = m
        }
        return answer
    }
}