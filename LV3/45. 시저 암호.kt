class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        for(c in s)
        {
            if(c.isUpperCase())
            {
                var tmp = (c - 'A').toInt()
                tmp += n
                tmp %= 26
                answer += (tmp + 'A'.toInt()).toChar()
            }
            else if(c.isLowerCase())
            {
                var tmp = (c - 'a').toInt()
                tmp += n
                tmp %= 26
                answer += (tmp + 'a'.toInt()).toChar()
            }
            else
                answer += c
        }
        return answer
    }
}