class Solution {
    fun solution(s: String): String {
        var answer = ""
        var h = (s.length / 2)
        if((s.length % 2) < 1)
        {
            answer += s[h - 1];
            answer += s[h];
        }
        else
            answer += s[h]
        return answer
    }
}