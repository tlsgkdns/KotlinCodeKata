class Solution {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        var (s1, s2) = longArrayOf(0, 0); var answer = -1;
        for(n in queue1) s1 += n.toLong()
        for(n in queue2) s2 += n.toLong()
        if(((s1 + s2) % 2) == 0L)
        {
            val h = (s1 + s2) / 2
            var q = (queue1 + queue2)
            var (l, r, cnt) = intArrayOf(0, queue1.size - 1, 0)
            while(true)
            {
                if(h == s1)
                {
                    answer = cnt
                    break
                }
                ++cnt
                if(h > s1)
                {
                    if(r == q.size - 1) break
                    s1 += q[++r]
                }
                else
                {
                    s1 -= q[l++]
                }
            }
        }
        return answer
    }
}