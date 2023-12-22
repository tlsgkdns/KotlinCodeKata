class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var score: MutableMap<Char, Int> = mutableMapOf()
        for((idx, c) in choices.withIndex())
        {
            if(c == 4) continue
            if(c < 4)
            {
                score[survey[idx][0]] = (score[survey[idx][0]]?: 0) +4 - c
            }
            else
            {
                score[survey[idx][1]] = (score[survey[idx][1]]?: 0) + c - 4
            }
        }
        var answer = ""
        answer += if((score['R'] ?: 0) < (score['T'] ?: 0)) "T" else "R"
        answer += if((score['C'] ?: 0) < (score['F'] ?: 0)) "F" else "C"
        answer += if((score['J'] ?: 0) < (score['M'] ?: 0)) "M" else "J"
        answer += if((score['A'] ?: 0) < (score['N'] ?: 0)) "N" else "A"
        return answer
    }
}