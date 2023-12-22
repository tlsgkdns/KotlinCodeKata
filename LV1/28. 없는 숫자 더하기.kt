class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var nums = BooleanArray(10)
        for(n in numbers) nums[n] = true
        for(i in 0..9) if(!nums[i]) answer += i
        return answer
    }
}