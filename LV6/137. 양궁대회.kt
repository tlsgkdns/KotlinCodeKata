class Solution {
    lateinit var inf: IntArray
    var result = IntArray(11){0}
    var answer = intArrayOf(-1)
    var sub = 0
    var l = 0
    fun solve(idx: Int, cnt: Int)
    {
        if(cnt == l)
        {
            var (s1, s2) = intArrayOf(0, 0)
            for(i in inf.indices)
            {
                if(inf[i] == 0 && result[i] == 0) continue
                if(inf[i] < result[i])
                {
                    s1 += (10 - i);
                }
                else
                {
                    s2 += (10 - i)
                }
            }
            if(s1 > s2 && s1 - s2 > sub)
            {
                answer = result.copyOf();
                sub = s1 - s2
            }
            return
        }
        if(idx < 0) return
        ++result[idx]
        solve(idx, cnt + 1)
        --result[idx]
        solve(idx - 1, cnt)
    }
    fun solution(n: Int, info: IntArray): IntArray {
        inf = info
        l = n
        solve(10, 0)
        return answer
    }
}