import java.util.*
import kotlin.math.max

class Solution {
    fun solution(cap: Int, n: Int, deliveries: IntArray, pickups: IntArray): Long {
        var answer = 0L
        val pick = Stack<Int>().apply { pickups.forEach { this.push(it) } }
        val delivery = Stack<Int>().apply { deliveries.forEach { this.push(it) } }
        while (!delivery.empty() || !pick.empty())
        {
            while(!delivery.empty() && delivery.peek() == 0) delivery.pop()
            while (!pick.empty() && pick.peek() == 0) pick.pop()
            answer += max(delivery.size, pick.size) * 2
            var cnt = cap
            while (!delivery.empty() && cnt > delivery.peek())
            {
                cnt -= delivery.peek()
                delivery.pop()
            }
            if(!delivery.empty() && cnt > 0)
            {
                val tmp = delivery.peek() - cnt
                delivery.pop()
                delivery.push(tmp)
            }
            cnt = cap
            while (!pick.empty() && cnt > pick.peek())
            {
                cnt -= pick.peek()
                pick.pop()
            }
            if(!pick.empty() && cnt > 0)
            {
                val tmp = pick.peek() - cnt
                pick.pop()
                pick.push(tmp)
            }
        }
        return answer
    }
}