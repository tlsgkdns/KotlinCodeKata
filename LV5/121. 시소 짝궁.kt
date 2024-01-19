class Solution {
    fun gcd(a: Long, b: Long): Long
    {
        if(a < b) return gcd(b, a)
        if(b == 0L) return a
        return gcd(b, a % b)
    }
    fun solution(weights: IntArray): Long {
        var answer: Long = 0
        val cnt: MutableMap<Long, Long> = mutableMapOf()
        for(w in weights) cnt[w.toLong()] = (cnt[w.toLong()] ?: 0) + 1
        for(n1 in cnt)
            for(n2 in cnt)
            {
                if(n1.key == n2.key)
                {
                    answer += (n1.value * (n1.value - 1))
                    continue
                }
                val g = gcd(n1.key, n2.key)
                if((n1.key / g) in (2.. 4) && (n2.key / g) in (2 .. 4)
                    || ((n1.key / g) == 1L && (n2.key / g) == 2L) || ((n1.key / g) == 2L && (n2.key / g) == 1L))
                    answer += n1.value * n2.value
            }
        answer /= 2
        return answer
    }
}