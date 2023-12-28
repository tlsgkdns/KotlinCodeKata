class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        val D: MutableMap<String, Int> = mutableMapOf()
        var answer: Int = 0
        for(i in 0 until 10)
            D[discount[i]] = (D[discount[i]] ?: 0) + 1
        var l = 0; var r = 10
        while(true)
        {
            var f = true
            for(i in want.indices)
            {
                if(D[want[i]] != number[i])
                {
                    f = false
                    break
                }
            }
            if(f) ++answer
            if(r == discount.size) break
            D[discount[l]] = (D[discount[l]] ?: 1) - 1
            D[discount[r]] = (D[discount[r]] ?: 0) + 1
            ++l; ++r;
        }
        return answer
    }
}