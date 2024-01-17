import java.util.PriorityQueue

class Solution {
    var adj = Array<MutableList<Pair<Int, Int>>>(51){ mutableListOf() }
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        var answer = 0
        for(i in road.indices)
        {
            adj[road[i][0]] += Pair(road[i][1], road[i][2])
            adj[road[i][1]] += Pair(road[i][0], road[i][2])
        }
        val d = IntArray(51){2000000007}
        val pq = PriorityQueue(Comparator<Pair<Int, Int>>{
                a, b -> if(a.first == b.first) a.second.compareTo(b.second) else a.first.compareTo(b.first)
        })
        pq.add(Pair(0, 1))
        d[1] = 0
        while (!pq.isEmpty())
        {
            val here = pq.peek().second
            val cost = pq.peek().first
            pq.poll()
            for(ad in adj[here])
            {
                val nxtCost = ad.second + cost
                val there = ad.first
                if(d[there] > nxtCost && nxtCost <= k)
                {
                    d[there] = nxtCost
                    pq.add(Pair(nxtCost, there))
                }
            }
        }
        for(a in d) if(a <= k) ++answer
        return answer
    }
}