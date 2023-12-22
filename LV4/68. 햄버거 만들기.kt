import java.util.Stack

class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        var stack = Stack<String>()
        for(a in  ingredient)
        {
            if(stack.empty())
            {
                stack.push(a.toString())
                continue
            }
            when(a)
            {
                1 -> if(stack.peek() == "123")
                {
                    stack.pop()
                    ++answer
                }
                else
                {
                    stack.push(a.toString())
                }
                2 -> if(stack.peek() == "1")
                {
                    stack.pop()
                    stack.push("12")
                }
                else
                {
                    stack.push(a.toString())
                }
                3 -> if(stack.peek() == "12")
                {
                    stack.pop()
                    stack.push("123")
                }
                else
                {
                    stack.push(a.toString())
                }
            }
        }
        return answer
    }
}