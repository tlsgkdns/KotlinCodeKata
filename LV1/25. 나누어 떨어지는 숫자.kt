class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var tmp = mutableListOf<Int>();
        for(n in arr)
        {
            if(n % divisor == 0)
                tmp.add(n)
        }
        tmp.sort()
        if(tmp.size == 0) tmp.add(-1)
        var answer = IntArray(tmp.size)
        var idx = 0
        for(n in tmp) answer[idx++] = n
        return answer
    }
}