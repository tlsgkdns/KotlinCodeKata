class Solution {
    fun solution(s: String): String {
        var answer = ""
        var arr = s.split(" ").map{it.toInt()}
        var mx = arr[0]; var mn = arr[0]
        for(i in 1 .. arr.size - 1)
        {
            mx = mx.coerceAtLeast(arr[i])
            mn = mn.coerceAtMost(arr[i])
        }
        answer = "$mn $mx"
        return answer
    }
}