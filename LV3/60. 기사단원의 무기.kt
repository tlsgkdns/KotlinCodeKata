class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        for(num in 1 .. number)
        {
            var d = 0; var n = 1
            while(n * n <= num)
            {
                if(num % n == 0)
                {
                    if(n * n == num) ++d
                    else d += 2
                    if(d > limit)
                    {
                        d = -1
                        answer += power
                        break
                    }
                }
                ++n
            }

            if(d > 0)
                answer += d
        }
        return answer
    }
}