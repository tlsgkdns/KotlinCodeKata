class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        for(n in 1..count)
            answer += price * n
        if(answer < money) answer = 0
        else answer = answer - money
        return answer
    }
}