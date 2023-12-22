import kotlin.math.*


class Solution {
    fun solution(n: Long): Long {
        var answer: Double = 0.0
        var x = sqrt(n.toDouble())
        if(x % 1.0 == 0.0) answer = (x + 1).pow(2)
        else answer = -1.0;
        return answer.toLong()
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12934