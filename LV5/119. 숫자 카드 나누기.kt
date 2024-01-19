class Solution {
    fun gcd(a: Int, b: Int): Int
    {
        if(a < b) return gcd(b, a)
        if(b == 0) return a
        return gcd(b, a % b)
    }
    fun solution(arrayA: IntArray, arrayB: IntArray): Int {
        var (g1, g2, answer) = intArrayOf(arrayA[0], arrayB[0], 0)
        for(n in arrayA) g1 = gcd(g1, n)
        for(n in arrayB) g2 = gcd(g2, n)
        if(g1 <= g2 && arrayA.all { it % g2 > 0 }) answer = g2
        if(g1 >= g2 && arrayB.all { it % g1 > 0 }) answer = g1
        return answer
    }
}