class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val reported : MutableMap<String, Int> = mutableMapOf()
        val whoReports: MutableMap<String, MutableList<String>> = mutableMapOf()
        val stop: MutableSet<String> = mutableSetOf()
        val L = report.distinct().map{it.split(" ")}
        for(r in L)
        {
            if(!whoReports.containsKey(r[0]))
            {
                whoReports[r[0]] = mutableListOf()
            }
            whoReports[r[0]]!!.add(r[1])
            if(!reported.containsKey(r[1]))
            {
                reported[r[1]] = 0
            }
            reported[r[1]] = reported[r[1]]!! + 1
        }
        for(re in reported) {
            if (re.value >= k)
                stop.add(re.key)
        }

        for(id in id_list)
        {
            var cnt = 0
            if(whoReports[id] != null)
            {
                for(r in whoReports[id]!!)
                {
                    if(stop.contains(r))
                        ++cnt
                }
            }
            answer += cnt
        }
        return answer
    }
}