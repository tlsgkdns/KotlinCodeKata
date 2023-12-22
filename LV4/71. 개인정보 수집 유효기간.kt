class Solution {
    fun toDate(d: String): Int
    {
        var cal = d.split('.')
        return cal[0].toInt() * (12 * 28) + (cal[1].toInt() - 1) * 28 + cal[2].toInt()
    }
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var period:MutableMap<String, Int> = mutableMapOf()
        var d = toDate(today)
        for(t in terms)
        {
            val arr = t.split(' ')
            period[arr[0]] = arr[1].toInt() * 28
        }
        for((idx, p) in privacies.withIndex())
        {
            val arr = p.split(" ")
            if(d >= toDate(arr[0]) + (period[arr[1]] ?: 0))
            {
                answer += (idx + 1)
            }
        }
        return answer
    }
}