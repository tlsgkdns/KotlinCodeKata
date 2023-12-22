class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var idx = 0; var i = 1
        var cnt1 = 1; var cnt2 = 0
        while(i < s.length)
        {
            if(s[idx] != s[i]) ++cnt2;
            else ++cnt1
            if(cnt1 == cnt2)
            {
                cnt1 = 1
                cnt2 = 0
                idx = i + 1
                i = i + 2
                ++answer
            }
            else
                ++i
        }
        if(idx < s.length) ++answer;
        return answer
    }
}