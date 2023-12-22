class Solution {
    var str = arrayOf("zero", "one", "two", "three"
        , "four", "five", "six", "seven", "eight", "nine")
    fun solution(s: String): Int {
        var answer: String = ""
        var idx: Int = 0
        while(idx < s.length)
        {
            if(s[idx].isDigit())
            {
                answer += s[idx++]
                continue
            }
            for((i, w) in str.withIndex())
                if(idx + w.length <= s.length && s.substring(idx, idx + w.length) == w)
                {
                    idx += w.length
                    answer += i.toString()
                    break
                }
        }
        return answer.toInt()
    }
}