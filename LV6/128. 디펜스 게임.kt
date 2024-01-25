import java.util.PriorityQueue

class Solution {
    fun solution(n: Int, k: Int, enemy: IntArray): Int {
        var (cnt, s, answer) = intArrayOf(0, 0, enemy.size)
        val pq = PriorityQueue<Int>()
        for((idx, e) in enemy.withIndex())
        {
            s += e
            pq.add(-e)
            if(s > n)
            {
                if(cnt >= k)
                {
                    answer = idx
                    break
                }
                s += pq.peek()
                pq.poll()
                ++cnt
            }
        }
        return answer
    }
}