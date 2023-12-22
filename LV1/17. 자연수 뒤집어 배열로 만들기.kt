class Solution {
    fun solution(n: Long): IntArray {
        var tmp = n; var cnt = 0
        while(tmp > 0)
        {
            tmp /= 10
            ++cnt
        }
        var answer = IntArray(cnt); var idx = 0
        tmp = n
        while(tmp > 0)
        {
            answer[idx++] = (tmp % 10).toInt()
            tmp /= 10
        }
        return answer
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12932