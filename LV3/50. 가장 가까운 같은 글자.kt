class Solution {
    var L = IntArray(26)
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        for(idx in 0 .. s.length - 1)
        {
            if(L[s[idx] - 'a'] == 0) answer += -1
            else answer += idx - L[s[idx] - 'a'] + 1
            L[s[idx] - 'a'] = idx + 1
        }
        return answer
    }
}