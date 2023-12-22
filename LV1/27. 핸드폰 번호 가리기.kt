class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        for(i in 0..phone_number.length - 1)
            if(phone_number.length - i <= 4)
                answer += phone_number[i]
            else
                answer += "*"
        return answer;
    }
}