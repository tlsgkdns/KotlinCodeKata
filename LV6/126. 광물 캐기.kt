import kotlin.math.pow
class Solution {
    var pick = intArrayOf(1, 3, 2)
    var mineral = arrayOf("diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone")
    val mInfo = mutableMapOf("diamond" to 0, "iron" to 1, "stone" to 2)
    var answer = 1000000007
    fun dfs(idx: Int, acc: Int, d : Int)
    {
        if(idx >= mineral.size || d == 0)
        {
            answer = answer.coerceAtMost(acc)
            return
        }
        val eIdx = mineral.size.coerceAtMost(idx + 5)
        for(i in pick.indices)
        {
            if(pick[i] == 0) continue
            var s = 0
            for(j in idx until eIdx)
                s += if(mInfo[mineral[j]]!! < i)
                    (5.toDouble().pow(i - mInfo[mineral[j]]!!)).toInt() else 1
            --pick[i]
            dfs(eIdx, acc + s, d - 1)
            ++pick[i]
        }
    }
    fun solution(picks: IntArray, minerals: Array<String>): Int {
        pick = picks
        mineral = minerals
        dfs(0, 0, pick.sum())
        return answer
    }
}