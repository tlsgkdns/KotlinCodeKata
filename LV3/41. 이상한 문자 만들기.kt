class Solution {
    fun solution(s: String): String {
        var answer = ""
        var l = 0
        for(c in s)
            if(c == ' ')
            {
                answer += ' '
                l = 0
            }
            else
            {
                if(l % 2 == 0)
                    answer += (c.toUpperCase())
                else
                    answer += (c.toLowerCase())
                ++l
            }
        return answer
    }
}