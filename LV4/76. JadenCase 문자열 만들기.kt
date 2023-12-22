class Solution {
    fun solution(s: String): String {
        var answer = ""
        var blank = true
        for(i in 0 until s.length)
        {
            if(s[i].isLetter())
            {
                if(blank) answer += s[i].uppercase()
                else answer += s[i].lowercase()
                blank = false
            }
            else if(s[i] == ' ')
            {
                blank = true
                answer += s[i]
            }
            else if(blank)
            {
                blank = false
                answer += s[i]
            }
        }
        return answer
    }
}