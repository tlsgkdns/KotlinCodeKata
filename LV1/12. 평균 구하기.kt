class Solution {
    fun solution(arr: IntArray): Double {
        var answer: Double = 0.0
        for(i in arr) answer += i
        answer /= arr.size.toDouble()
        return answer
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12944?language=kotlin