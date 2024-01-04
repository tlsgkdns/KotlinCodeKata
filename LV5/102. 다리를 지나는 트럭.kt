import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        val q:Queue<Int> = LinkedList()
        var S = 0;
        var cnt = 0; var idx = 0
        while(cnt < truck_weights.size)
        {
            if(q.size == bridge_length)
            {
                if(q.peek() > 0) ++cnt
                S -= q.poll()
            }
            if(idx < truck_weights.size && S + truck_weights[idx] <= weight)
            {
                S += truck_weights[idx]
                q.add(truck_weights[idx++])
            }
            else
            {
                q.add(0)
            }
            ++answer
        }
        return answer
    }
}