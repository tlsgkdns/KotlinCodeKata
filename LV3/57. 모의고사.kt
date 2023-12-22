class Solution {
    val persons: Array<Array<Int>> = arrayOf(arrayOf(1,2,3,4,5), arrayOf(2,1,2,3,2,4,2,5), arrayOf(3,3,1,1,2,2,4,4,5,5))

    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        var correct = arrayOf(0, 0, 0)
        for((i, p) in persons.withIndex())
        {
            for((idx, a) in answers.withIndex())
            {
                if(a == p[idx % p.size])
                    ++correct[i]
            }
        }
        var m = 0
        for(c in correct) if(m < c) m = c
        for(i in 0 .. 2) if(m == correct[i]) answer += (i + 1)

        return answer
    }
}