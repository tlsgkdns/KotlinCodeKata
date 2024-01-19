class Solution {
    fun gcd(a: Long, b: Long): Long
    {
        if(a < b) return gcd(b, a)
        if(b == 0L) return a
        return gcd(b, a % b)
    }
    fun solution(w: Int, h: Int): Long {
        var answer: Long = 0
        var a = w.toLong()
        var b = h.toLong()
        return (a * b - a - b + gcd(a, b))
    }
}