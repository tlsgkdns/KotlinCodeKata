class Solution {
    fun solution(s: String): String {
        var answer = ""
        var str = s.toCharArray()
        str.sortDescending()
        for(i in str) answer += i
        return answer
    }
}