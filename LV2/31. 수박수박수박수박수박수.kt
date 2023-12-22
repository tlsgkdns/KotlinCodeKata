class Solution {
    fun solution(n: Int): String {
        var answer = ""
        var su = arrayOf("수", "박")
        for(i in 0 .. n - 1)
            answer += su[i % 2]
        return answer
    }
}