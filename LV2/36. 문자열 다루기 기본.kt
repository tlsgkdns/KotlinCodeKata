class Solution {
    fun solution(s: String): Boolean {
        var answer = false
        if(s.length == 4 || s.length == 6)
        {
            answer = true
            try
            {
                var n = s.toInt()
            } catch (e : java.lang.NumberFormatException)
            {
                answer = false
            }
        }
        return answer
    }
}