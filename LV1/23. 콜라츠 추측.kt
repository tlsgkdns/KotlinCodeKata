class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var n = num;
        while(answer < 500 && n != 1)
        {
            if(n % 2 > 0)
                n = (n * 3) + 1
            else
                n /= 2;
            ++answer
        }
        if(answer >= 500) answer = -1;
        return answer
    }
}