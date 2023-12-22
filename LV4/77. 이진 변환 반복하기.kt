class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var z = 0; var n = 0
        var str = s
        while(str.length > 1)
        {
            var cnt = str.count { it == '1' }
            z += str.length - cnt
            var tmp = ""
            var d = 1
            while(d <= cnt) d *= 2
            d /= 2
            while(d > 0)
            {
                if(d <= cnt)
                {
                    cnt -= d
                    tmp += "1"
                }
                else
                    tmp += "0"
                d /= 2
            }
            str = tmp
            ++n
        }
        answer += n
        answer += z
        return answer
    }
}