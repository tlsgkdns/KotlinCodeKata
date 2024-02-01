import kotlin.math.min

class Solution {

    fun solve(name: String, cmp: String, idx: Int, turn: Int): Int
    {
        if(name == cmp) return 0
        if(turn > name.length) return 9999
        val builder = StringBuilder(cmp)
        builder[idx] = name[idx]
        val l = if(idx - 1 >= 0) idx - 1 else cmp.length - 1
        val r = if(idx + 1 < cmp.length) idx + 1 else 0
        val sub = name[idx].code - cmp[idx].code
        val m = if(sub > 13) 26 - sub else sub
        return min(solve(name, builder.toString(), l, turn + 1), solve(name, builder.toString(), r, turn + 1)) + m + 1
    }
    fun solution(name: String): Int {
        val builder = StringBuilder()
        repeat(name.length){builder.append('A')}
        var answer = solve(name,builder.toString(), 0, 0)
        if(answer > 0) --answer
        return answer
    }
}