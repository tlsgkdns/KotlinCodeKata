class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n)
        for(num in 0..n-1)
        {
            answer.set(num, num.toLong() * x.toLong() + x.toLong())
        }
        return answer
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12954