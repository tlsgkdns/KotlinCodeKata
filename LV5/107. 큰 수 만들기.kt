class Solution {
    fun solution(number: String, k: Int): String {
        var n = StringBuilder(number)
        var cnt = k
        var idx = 0
        while(cnt > 0 && idx < n.length - 1)
        {
            if(n[idx] < n[idx + 1])
            {
                n = n.delete(idx, idx + 1)
                --cnt
                idx = if(idx == 0) idx else --idx
            }
            else
                idx++
        }
        if(cnt == k) return number.dropLast(k)
        return n.toString()
    }
}