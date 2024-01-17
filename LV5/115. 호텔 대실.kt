class Solution {
    fun timeToInt(time: String): Int
    {
        return time.split(":").let { it[0].toInt() * 60 + it[1].toInt() }
    }
    fun solution(book_time: Array<Array<String>>): Int {
        var answer: Int = 0
        var cnt = 0
        val arr: MutableList<Pair<Int, Int>> = mutableListOf()
        for(book in book_time)
            for(i in book.indices)
                arr.add(Pair(if(i == 0) timeToInt(book[i]) else timeToInt(book[i]) + 10, i))
        arr.sortWith{p1, p2 -> if(p1.first == p2.first) (-p1.second).compareTo(-p2.second) else p1.first.compareTo(p2.first)}

        for(t in arr)
        {
            if(t.second == 1) --cnt
            else ++cnt
            answer = answer.coerceAtLeast(cnt)
        }
        return answer
    }
}