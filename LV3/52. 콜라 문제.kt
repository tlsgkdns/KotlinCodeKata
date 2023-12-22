class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var r = n;
        while(r >= a)
        {
            var tmp = r / a
            r %= a
            r += (tmp * b)
            answer += (tmp * b)
        }
        return answer
    }
}