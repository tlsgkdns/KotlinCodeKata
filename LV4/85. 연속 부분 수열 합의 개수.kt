class Solution {
    fun solve(acc: IntArray, l: Int, r: Int): Int
    {
        if(l <= r) return acc[r] - acc[l - 1]
        return acc.last() - acc[l - 1] + acc[r]
    }
    fun solution(elements: IntArray): Int {
        var answer: Int = 0
        val s: MutableSet<Int> = mutableSetOf()
        val acc = IntArray(elements.size + 1)
        for(i in 1 .. elements.size)
        {
            acc[i] = acc[i - 1] + elements[i - 1]
        }
        for(l in elements.indices)
            for(idx in 1 .. elements.size)
            {
                val eidx = if(l + idx > elements.size) (l + idx - elements.size)
                else l + idx
                s.add(solve(acc, idx, eidx))
            }
        return s.size
    }
}