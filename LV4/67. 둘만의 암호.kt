class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer = ""
        for(c in s)
        {
            var cnt = 0
            var now = c
            while(cnt < index)
            {
                if(skip.none{it == now}) ++cnt
                if(now == 'z') now = 'a'
                else ++now
            }
            while(skip.any {it == now})
            {
                if(now == 'z') now = 'a'
                else ++now
            }
            answer += now
        }
        return answer
    }
}