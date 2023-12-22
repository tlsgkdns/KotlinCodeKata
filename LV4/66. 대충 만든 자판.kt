class Solution {
    var cnt = IntArray(26){10000}
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        for(k in keymap)
        {
            for(idx in k.indices)
            {
                cnt[k[idx].code - 'A'.code] = cnt[k[idx].code - 'A'.code].coerceAtMost(idx + 1)
            }
        }
        for(t in targets)
        {
            var s = 0
            for(c in t)
            {
                if(cnt[c.code - 'A'.code] >= 10000)
                {
                    s = -1;
                    break
                }
                s += cnt[c.code - 'A'.code]
            }
            answer += s
        }
        return answer
    }
}