import java.util.Stack

class Solution {

    fun getTime(t: String): Int
    {
        return t.split(":").let { it[0].toInt() * 60 + it[1].toInt() }
    }
    fun solution(plans: Array<Array<String>>): Array<String> {
        val sortedPlan = plans.sortedBy { getTime(it[1]) }
        val stack = Stack<IntArray>()
        var workStart = -1
        var working = -1
        var time = 0
        var idx = 0
        var progress = 0
        var answer = arrayOf<String>()
        while(answer.size < sortedPlan.size)
        {
            if(working >= 0 && time == workStart + sortedPlan[working][2].toInt() - progress)
            {
                answer += sortedPlan[working][0]
                if (!stack.empty() && ((idx >= sortedPlan.size || time < getTime(sortedPlan[idx][1]))))
                {
                    working = stack.peek()[0]
                    progress = stack.peek()[1]
                    workStart = time
                    stack.pop()
                }
                else
                {
                    working = -1
                    workStart = -1
                    progress = 0
                }
            }
            if(idx < sortedPlan.size && time == getTime(sortedPlan[idx][1]))
            {
                if(working >= 0)
                {
                    stack.push(intArrayOf(working, time - workStart + progress))
                }
                working = idx++
                workStart = time
                progress = 0
            }
            ++time
        }
        return answer
    }
}