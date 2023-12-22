class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var pos: MutableMap<String, Int> = mutableMapOf()
        var answer = players
        for((idx, p) in players.withIndex())
        {
            pos[p] = idx
        }
        for(c in callings)
        {
            val idx = pos[c]?:0
            pos[c] = idx - 1
            pos[answer[idx - 1]] = idx
            val tmp = answer[idx]
            answer[idx] = answer[idx - 1]
            answer[idx - 1] = tmp
        }
        return answer
    }
}