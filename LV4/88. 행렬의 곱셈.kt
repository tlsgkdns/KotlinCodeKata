class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()
        for(i in 0 until arr1.size)
        {
            var r = intArrayOf()
            for(k in 0 until arr2[0].size)
            {
                var s = 0
                for(j in 0 until arr1[0].size)
                    s += arr1[i][j] * arr2[j][k]
                r += s
            }
            answer += r
        }
        return answer
    }
}