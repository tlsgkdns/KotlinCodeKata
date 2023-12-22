class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for(n in left .. right)
        {
            var cnt: Int = 0
            for(a in 1 .. n)
                if(n % a == 0)
                    ++cnt;
            if(cnt % 2 > 0) answer -= n
            else answer += n
        }
        return answer
    }
}