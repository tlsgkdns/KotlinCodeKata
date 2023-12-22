class Solution {
    fun solution(angle: Int): Int {
        var answer: Int = 0
        when(angle)
        {
            in 0 .. 89 -> answer = 1
            90 -> answer = 2
            in 91 .. 179 -> answer = 3
            180 -> answer = 4
        }
        return answer
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120829