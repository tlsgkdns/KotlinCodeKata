import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        val q: Queue<Int> = LinkedList()
        var answer = -1
        q.add(x)
        val v = IntArray(1000001){-1}
        v[x] = 0
        while (!q.isEmpty())
        {
            val now = q.peek()
            q.remove()
            if(now == y)
            {
                answer = v[now]
                break
            }
            if(now + n <= y && v[now + n] < 0)
            {
                v[now + n] = v[now] + 1
                q.add(now + n)
            }
            if(2 * now <= y && v[2 * now] < 0)
            {
                v[2 * now] = v[now] + 1
                q.add(2 * now)
            }
            if(3 * now <= y && v[3 * now] < 0)
            {
                v[3 * now] = v[now] + 1
                q.add(3 * now)
            }
        }
        return answer
    }
}