class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var idx = 0; var now = 0
        while(idx < section.size)
        {
            if(now < section[idx]) now = section[idx]
            now += (m - 1)
            ++answer
            while(idx < section.size && section[idx] <= now)
                ++idx
        }
        return answer
    }
}