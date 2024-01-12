import kotlin.math.abs
class Solution {
    val v = Array(101){BooleanArray(101) {false} }
    lateinit var adj: Array<MutableList<Pair<Int, Int>>>
    fun dfs(here : Int, ignore: Int): Int
    {
        var ret = 1
        for(p in adj[here])
        {
            val there = p.first
            val idx = p.second
            if(idx == ignore || v[there][ignore]) continue
            v[there][ignore] = true
            ret += dfs(there, ignore)
        }
        return ret
    }
    fun solution(n: Int, wires: Array<IntArray>): Int {
        adj = Array(n + 1){ mutableListOf() }
        for((idx, w) in wires.withIndex())
        {
            adj[w[0]].add(Pair(w[1], idx))
            adj[w[1]].add(Pair(w[0], idx))
        }
        var answer = n
        for(i in wires.indices)
        {
            v[1][i] = true
            val k = dfs(1, i)
            answer = answer.coerceAtMost(abs(n - 2 * k))
        }
        return answer
    }
}