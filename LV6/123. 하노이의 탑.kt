class Solution {
    var answer = arrayOf<IntArray>()
    fun hanoi(h: Int, s: Int, d: Int, m: Int)
    {
        if(h == 1)
        {
            answer += intArrayOf(s, d)
            return
        }
        hanoi(h - 1, s, m, d)
        hanoi(1, s, d, m)
        hanoi(h - 1, m, d, s)
    }
    fun solution(n: Int): Array<IntArray> {
        hanoi(n, 1, 3, 2)
        return answer
    }
}