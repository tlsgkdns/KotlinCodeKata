class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        var m = arr[0]
        for(n in arr)
            if(m > n)
                m = n
        for(n in arr)
            if(n != m)
                answer += n
        if(answer.size == 0) answer += -1
        return answer
    }
}