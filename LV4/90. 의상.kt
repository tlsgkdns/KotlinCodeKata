class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val m = mutableMapOf<String, Int>()
        for(c in clothes) m[c[1]] = (m[c[1]] ?: 0) + 1
        for(p in m) answer *= (p.value + 1)
        --answer
        return answer
    }
}