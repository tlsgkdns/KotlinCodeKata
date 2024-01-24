class Solution {
    var c = intArrayOf()
    var v = booleanArrayOf()
    fun dfs(here: Int): Int
    {
        val there = c[here - 1]
        if(v[there]) return 0
        v[there] = true
        return dfs(there) + 1
    }
    fun solution(cards: IntArray): Int {
        var answer = -1
        c = cards
        for(i in 1..cards.size)
            for(j in 1..cards.size)
            {
                v = BooleanArray(cards.size + 1){false}
                val (a, b) = intArrayOf(dfs(i), dfs(j))
                answer = answer.coerceAtLeast(a * b)
            }
        return answer
    }
}