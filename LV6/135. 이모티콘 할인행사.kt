class Solution {
    lateinit var userList: Array<IntArray>
    lateinit var emoticonList: IntArray
    var sale = IntArray(8)
    var answer = intArrayOf(0, 0)
    fun solve(idx: Int)
    {
        if(idx == emoticonList.size)
        {
            var join = 0
            var buy = 0
            for (user in userList)
            {
                var s = 0
                for(i in emoticonList.indices)
                    if(sale[i] >= user[0])
                        s += (emoticonList[i] * (100 - sale[i])) / 100
                if(s >= user[1]) ++join
                else buy += s
            }
            if(answer[0] < join || (answer[0] == join && buy > answer[1]))
            {
                answer = intArrayOf(join, buy)
            }
            return
        }
        for(i in 1 .. 4)
        {
            sale[idx] = i * 10
            solve(idx + 1)
            sale[idx] = 0
        }
    }
    fun solution(users: Array<IntArray>, emoticons: IntArray): IntArray {
        emoticonList = emoticons
        userList = users
        solve(0)
        return answer
    }
}