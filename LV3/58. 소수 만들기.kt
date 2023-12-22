class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0

        for(i in 0 .. nums.size - 1)
            for(j in i + 1 .. nums.size - 1)
                for(k in j + 1 .. nums.size - 1)
                {
                    var num = nums[i] + nums[j] + nums[k]
                    var p = true
                    for(n in 2 .. num - 1)
                        if(num % n == 0)
                        {
                            p = false
                            break
                        }
                    if(p) ++answer
                }

        return answer
    }
}