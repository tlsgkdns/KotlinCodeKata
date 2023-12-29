import kotlin.math.sqrt
class Solution {
    fun isPrime(num: Long): Boolean
    {
        if(num == 1L) return false
        if(num == 2L) return true
        for(i in 2..sqrt(num.toDouble()).toInt() + 1)
        {
            if(num % i.toLong() == 0L) return false
        }
        return true
    }
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        var three = ""; var cnt = 0; var d = 1
        var num = n
        while(n >= d)
        {
            d *= k
            ++cnt
        }
        d /= k
        while(d > 0)
        {
            if(num >= d)
            {
                three += ((num / d) + '0'.code).toChar()
                num -= (num / d) * d
            }
            else
                three += "0"
            --cnt
            d /= k
        }
        while (cnt > 0)
        {
            three += "0"
            --cnt
        }
        var tmp = ""

        for(i in three.indices)
        {
            if(three[i] == '0')
            {
                if(tmp.isNotBlank() && isPrime(tmp.toLong()))
                    ++answer
                tmp = ""
            }
            else
                tmp += three[i]
        }
        if(tmp.isNotBlank() && isPrime(tmp.toLong())) ++answer
        return answer
    }
}