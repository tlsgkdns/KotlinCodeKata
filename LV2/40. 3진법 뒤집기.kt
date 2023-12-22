class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0; var num = n
        var t: Long = 1
        var d = 1;
        while(n >= t) t *= 3
        t /= 3
        while(t > 0)
        {
            if(num >= t)
            {
                answer += ((num / t.toInt()) * d)
                num %= t.toInt()
            }
            t /= 3
            d *= 3
        }
        return answer
    }
}