class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        val dic = HashMap<String, Int>()
        for(idx in plays.indices) dic[genres[idx]] = dic[genres[idx]]?.let { it + plays[idx] } ?: plays[idx]
        var arr: Array<Triple<String, Int, Int>> = arrayOf()
        val cnt = HashMap<String, Int>()
        for(idx in genres.indices)
        {
            arr += Triple(genres[idx], plays[idx], idx)
        }
        arr.sortWith(Comparator<Triple<String, Int, Int>>{
                s1, s2 ->
            if(dic[s1.first] != dic[s2.first]) dic[s2.first]!!.compareTo(dic[s1.first]!!)
            else if(s1.second != s2.second) s2.second.compareTo(s1.second)
            else s1.third.compareTo(s2.third)
        })
        var answer = intArrayOf()
        for(idx in arr.indices)
        {
            cnt[arr[idx].first] = cnt[arr[idx].first]?.let { it + 1 } ?: 1
            if(cnt[arr[idx].first]!! > 2) continue
            answer += arr[idx].third
        }
        return answer
    }
}