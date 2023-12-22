class Solution {
    var nums = BooleanArray(202)
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in 0 .. numbers.size - 1)
            for(j in i + 1 .. numbers.size - 1)
                if(!nums[numbers[i] + numbers[j]])
                {
                    nums[numbers[i] + numbers[j]] = true
                    answer += (numbers[i] + numbers[j])
                }
        answer.sort()
        return answer
    }
}