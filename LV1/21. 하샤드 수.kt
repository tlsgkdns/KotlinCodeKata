class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var num = x; var s = 0;
        while(num > 0)
        {
            s += (num % 10);
            num /= 10;
        }
        return (x % s == 0)
    }
}