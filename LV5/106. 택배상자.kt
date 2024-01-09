import java.util.Stack

class Solution {
    fun solution(order: IntArray): Int {
        val s = Stack<Int>()
        var (answer, idx) = intArrayOf(0, 0)
        for(n in 1 .. order.size)
        {
            if(order[idx] == n)
            {
                ++answer
                ++idx
                while(!s.empty() && s.peek() == order[idx])
                {
                    ++idx
                    ++answer
                    s.pop()
                }
            }
            else s.push(n)
        }
        return answer
    }
}