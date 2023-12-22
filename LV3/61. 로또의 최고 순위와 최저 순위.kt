class Solution {
    var v = BooleanArray(46)
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var a = 0; var z = 0;
        for(w in win_nums) v[w] = true
        for(l in lottos)
        {
            if(v[l]) ++a
            if(l == 0) ++z
        }
        answer += 6.coerceAtMost(7 - a - z); answer += 6.coerceAtMost(7 - a);
        return answer
    }
}