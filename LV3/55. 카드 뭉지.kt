class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = "Yes"
        var idx1 = 0; var idx2 = 0;
        for(w in goal)
        {
            if(idx1 < cards1.size && w == cards1[idx1])
                ++idx1
            else if(idx2 < cards2.size && w == cards2[idx2])
                ++idx2
            else
            {
                answer = "No"
                break
            }
        }
        return answer
    }
}