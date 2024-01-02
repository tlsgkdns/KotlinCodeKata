class Solution {
    var answer = 0
    var f = false
    fun solve(w : String, t: String)
    {
        if(w == t) f = true
        if(f) return
        ++answer
        if(w.length == 5) return
        solve(w + 'A', t)
        solve(w + 'E', t)
        solve(w + 'I', t)
        solve(w + 'O', t)
        solve(w + 'U', t)
    }
    fun solution(word: String): Int {
        solve("", word)
        return answer
    }
}