class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val q = ArrayDeque<Pair<Int, Int>>()
        val p = priorities.sortedByDescending { it }
        for((idx, e) in priorities.withIndex()) q.add(Pair(e, idx))
        var idx = 0
        while (!q.isEmpty())
        {
            val now = q.first().first
            val l = q.first().second
            q.removeFirst()
            if(p[idx] == now)
            {
                ++idx
                if(l == location)
                {
                    answer = idx
                    break
                }
            }
            else
                q.add(Pair(now, l))
        }
        return answer
    }
}