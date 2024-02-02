import kotlin.math.min

class Solution {
    fun solution(targets: Array<IntArray>): Int {
        targets.sortWith(Comparator{p1, p2 -> if(p1[0] == p2[0])
            -p1[1].compareTo(p2[1]) else p1[0].compareTo(p2[0])})
        var s = -1
        var e = -1
        var answer = 0
        for(target in targets)
        {
            if(target[0] >= s && target[0] < e)
            {
                s = target[0]
                e = min(target[1], e)
            }
            else
            {
                s = target[0]
                e = target[1]
                ++answer
            }
        }
        return answer
    }
}