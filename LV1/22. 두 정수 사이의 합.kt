class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        var aa = 0; var bb = 0;
        if(a < b)
        {
            aa = a;
            bb = b;
        }
        else
        {
            aa = b;
            bb = a;
        }
        for(n in aa .. bb)
            answer += n
        return answer
    }
}