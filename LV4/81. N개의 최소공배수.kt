class Solution {
    fun gcd(a: Int, b: Int): Int
    {
        if(a < b) return gcd(b, a)
        var p = a; var q = b;
        while(q != 0)
        {
            val tmp = p
            p = q
            q = (tmp % p)
        }
        return p
    }
    fun solution(arr: IntArray): Int {
        var answer = 1
        for(n in arr) answer = (n * answer) / gcd(n, answer)
        return answer
    }
}