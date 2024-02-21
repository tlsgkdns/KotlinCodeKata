class Solution {
    lateinit var adj: Array<IntArray>
    val v = BooleanArray(201){false}
    fun dfs(here: Int)
    {
        for(there in adj[here].indices)
        {
            if(adj[here][there] == 1 && !v[there])
            {
                v[there] = true
                dfs(there)
            }
        }
    }
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        adj = computers
        for(i in 0 until n)
            if(!v[i])
            {
                v[i] = true
                ++answer
                dfs(i)
            }
        return answer
    }
}