class Solution {
    var r = BooleanArray(32)
    var s = BooleanArray(32)
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n - lost.size
        for(a in reserve) r[a] = true
        lost.sort()
        for(l in lost)
        {
            if(r[l])
            {
                r[l] = false
                s[l] = true
                ++answer
            }
        }
        for(l in lost)
        {
            if(s[l]) continue
            if(l > 1 && r[l - 1])
            {
                r[l - 1] = false
                ++answer
            }
            else if(l < n && r[l + 1])
            {
                r[l + 1] = false
                ++answer
            }
        }
        return answer
    }
}