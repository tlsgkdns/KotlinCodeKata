class Solution {
    fun gcd(n: Int, m: Int): Int
    {
        var a = n; var b = m;
        if(a < b)
        {
            return gcd(b, a)
        }
        while(b != 0)
        {
            var n = a % b
            a = b
            b = n
        }
        return a
    }
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf(gcd(n, m), (n * m) / gcd(n, m))
        return answer
    }
}