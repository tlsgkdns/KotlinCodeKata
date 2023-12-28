class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in left .. right)
        {
            val x = i % n
            val y = i / n
            if(x > y)
                answer += (x.toInt() + 1)
            else
                answer += (y.toInt() + 1)
        }
        return answer
    }
}