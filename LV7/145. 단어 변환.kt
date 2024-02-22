import java.util.LinkedList
import java.util.Queue

class Solution {
    fun checkAdj(w1: String, w2: String): Boolean
    {
        var cnt = 0
        for(idx in w1.indices)
            cnt += if(w1[idx] != w2[idx]) 1 else 0
        return cnt == 1
    }
    fun solution(begin: String, target: String, words: Array<String>): Int {
        val newWords = if(words.find { begin == it } != null) words else words + begin
        val n = newWords.size
        val adj = Array(n){ BooleanArray(n){false} }

        for(i in newWords.indices)
            for(j in i + 1 until  n)
            {
                if(checkAdj(newWords[i], newWords[j]))
                {
                    adj[i][j] = true
                    adj[j][i] = true
                }
            }
        val sIdx = newWords.indexOf(begin)
        val eIdx = newWords.indexOf(target)
        val q: Queue<Int> = LinkedList()
        val v = IntArray(n){-1}
        q.add(sIdx)
        v[sIdx] = 0
        while (!q.isEmpty())
        {
            val here = q.peek()
            q.poll()
            for(there in newWords.indices)
                if(adj[here][there] && v[there] < 0)
                {
                    v[there] = v[here] + 1
                    q.add(there)
                }
        }
        var answer = if(eIdx < 0) 0 else v[eIdx]
        if(answer < 0) answer = 0
        return answer
    }
}