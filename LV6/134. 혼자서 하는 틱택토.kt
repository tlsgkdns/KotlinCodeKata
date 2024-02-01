class Solution {
    fun solve(board: Array<String>, now: Array<String>, turn: Char): Int
    {
        if(board.contentEquals(now)) return 1
        if(now.any { c -> c.all { it == 'O'} } || now.any { c -> c.all { it == 'X'} }) return 0
        for (i in 0..2)
            if(now[0][i] == now[1][i] && now[1][i] == now[2][i] && now[0][i] != '.')
                return 0
        if(now[0][0] == now[1][1] && now[1][1] == now[2][2] && (now[1][1] != '.')) return 0
        if(now[2][0] == now[1][1] && now[1][1] == now[0][2] && (now[1][1] != '.')) return 0
        for (i in board.indices)
            for(j in board[i].indices)
                if(now[i][j] == '.' && board[i][j] == turn)
                {
                    val builder = StringBuilder(now[i]).apply { this[j] = turn }
                    val nxt = now.copyOf().apply {this[i] = builder.toString()}
                    if(solve(board, nxt, if(turn == 'O') 'X' else 'O') == 1) return 1
                }
        return 0
    }
    fun solution(board: Array<String>): Int {
        var answer: Int = -1
        val now = arrayOf("...", "...", "...")
        return solve(board, now, 'O')
    }
}