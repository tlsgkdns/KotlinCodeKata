class Solution {

    fun solve(idx: Int, numbers: IntArray, target: Int, s: Int): Int
    {
        if(idx == numbers.size)
        {
            if(s == target) return 1
            return 0
        }
        return solve(idx + 1, numbers, target, s + numbers[idx]) + solve(idx + 1, numbers, target, s - numbers[idx])
    }

    fun solution(numbers: IntArray, target: Int): Int {
        var answer = solve(0, numbers, target, 0)
        return answer
    }
}