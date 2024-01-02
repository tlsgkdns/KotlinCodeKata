import java.util.Stack

class Solution {
    fun solution(numbers: IntArray): IntArray {
        val S: Stack<Int> = Stack<Int>()
        val result = IntArray(numbers.size){-1}
        for(i in numbers.size - 1 downTo 0)
        {
            while (!S.empty() && S.peek() <= numbers[i]) S.pop()
            if(!S.empty()) result[i] = S.peek()
            S.push(numbers[i])
        }
        return result
    }
}