class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        var tmp = food
        answer += "0"
        for(i in food.size - 1 downTo 1)
            while(tmp[i] > 1)
            {
                tmp[i] -= 2
                answer = (i).toString() + answer + (i).toString()
            }
        return answer
    }
}