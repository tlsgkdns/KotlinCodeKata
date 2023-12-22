class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var num = n; var d: Long = 1; var cnt = 0;
        while(d <= num)
        {
            d *= 10
            cnt++;
        }
        d /= 10
        var arr = LongArray(cnt)
        var idx = 0;
        while(num > 0)
        {
            arr[idx++] = (num % 10);
            num /= 10;
        }
        arr.sort(); d = 1
        for(n in arr)
        {
            answer += (d * n)
            d *= 10
        }
        return answer
    }
}