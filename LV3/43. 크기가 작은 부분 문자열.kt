class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        for(i in 0 .. t.length - p.length)
        {
            var str = t.substring(i until p.length + i)
            if(str.toLong() <= p.toLong())
                ++answer;
        }
        return answer
    }
}