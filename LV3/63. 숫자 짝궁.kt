class Solution {
    var xn = IntArray(10)
    var yn = IntArray(10)
    fun solution(X: String, Y: String): String {
        var answer = StringBuilder("")
        val z = '0'.toInt()
        for(c in X)
        {
            ++xn[c.toInt() - z]
        }
        for(c in Y)
        {
            ++yn[c.toInt() - z]
        }
        for(n in 9 downTo 0)
        {
            if(xn[n] == 0 || yn[n] == 0) continue
            if(n == 0 && answer.toString() == "")
                return "0"
            var v = n.toString()
            var L = xn[n].coerceAtMost(yn[n])
            for(i in 1 .. L)
            {
                answer.append(v)
            }
        }
        if(answer.toString() == "") return "-1"
        return answer.toString()
    }
}


class Solution {
    var xn = IntArray(10)
    var yn = IntArray(10)
    fun solution(X: String, Y: String): String {
        var answer = StringBuilder("")
        val list1 = X.groupingBy {ch -> ch}.eachCount();
        val list2 = Y.groupingBy {ch -> ch}.eachCount();
        val f = list2.filter { list1.containsKey(it.key)}.toList().sortedByDescending { it.first }
        for(n in f)
        {
            for(r in 1 .. list1[n.first]!!.coerceAtMost(list2[n.first]!!))
                answer.append(n.first)
        }
        if(answer.toString() == "") return "-1"
        else if(answer.toString()[0] == '0') return "0"
        return answer.toString()
    }
}