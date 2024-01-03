class Solution {
    fun solution(topping: IntArray): Int {
        val k1 = IntArray(10001){0}
        val k2 = IntArray(10001){0}
        var c1 = 0
        var c2 = 0
        var answer = 0
        for(t in topping)
        {
            if(k2[t] == 0) ++c2
            ++k2[t]
        }
        for(n in topping)
        {
            if(k1[n] == 0) ++c1
            ++k1[n]
            --k2[n]
            if(k2[n] == 0) --c2
            if(c1 == c2) ++answer
        }
        return answer
    }
}