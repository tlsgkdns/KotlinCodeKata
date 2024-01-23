class Solution {
    fun solution(data: Array<IntArray>, col: Int, row_begin: Int, row_end: Int): Int {
        var answer: Int = 0
        val result = data.sortedWith(compareBy({it[col - 1]}, {-it[0]}))
        for(r in row_begin .. row_end)
        {
            var s = 0
            for(e in result[r - 1]) s += (e % r)
            answer = answer.xor(s)
        }
        return answer
    }
}