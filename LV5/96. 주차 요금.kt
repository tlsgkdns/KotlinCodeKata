import kotlin.math.ceil

class Solution {
    fun timeToInt(t: String): Int
    {
        val s = t.split(":")
        return s[0].toInt() * 60 + s[1].toInt()
    }
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        val m = mutableMapOf<String, Int>()
        for(r in records)
        {
            val record = r.split(" ")
            val t = timeToInt(record[0])
            m[record[1]] = (m[record[1]] ?: 0) + (if(record[2] == "IN") -t else t)
        }
        val list = m.entries.sortedBy { it.key }
        var answer = intArrayOf()
        for(l in list)
        {
            var v = l.value
            if(v <= 0) v += timeToInt("23:59")
            if(v < fees[0]) answer += fees[1]
            else answer += (ceil((v - fees[0]).toDouble() / fees[2]).toInt() * fees[3]) + fees[1]
        }
        return answer
    }
}