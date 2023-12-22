class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()
        var tmp = strings.sortedWith(compareBy({it[n]}, {it}))
        for(w in tmp) answer += w
        return answer
    }
}