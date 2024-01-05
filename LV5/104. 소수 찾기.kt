class Solution {
    var isPrime = BooleanArray(10000001){true}
    var v = BooleanArray(8){false}
    var answer = 0
    fun solve(d: Int, str: String, numbers: String)
    {
        if(str.isNotEmpty() && isPrime[str.toInt()])
        {
            isPrime[str.toInt()] = false
            ++answer
        }
        if(d == numbers.length) return;
        for(i in numbers.indices)
        {
            if(v[i] || (d == 0 && numbers[i] == '0')) continue
            v[i] = true
            solve(d + 1, str + numbers[i], numbers)
            v[i] = false
        }
    }
    fun solution(numbers: String): Int {
        var n = 2;
        isPrime[0] = false
        isPrime[1] = false
        while(n * n <= 10000000)
        {
            if(isPrime[n])
            {
                var j = n + n;
                while(j <= 10000000)
                {
                    isPrime[j] = false
                    j += n
                }
            }
            ++n
        }
        solve(0, "", numbers)
        return answer
    }
}