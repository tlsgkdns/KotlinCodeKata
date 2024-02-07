class Solution {
    fun solution(line: Array<IntArray>): Array<String> {
        var intersection: Array<Pair<Long, Long>> = arrayOf()
        for(i in line.indices)
            for(j in i + 1 until line.size)
            {
                val down:Double = line[i][0] * line[j][1] - line[i][1] * line[j][0].toDouble()
                if(down == 0.0) continue
                val x = (line[i][1] * line[j][2].toLong()  - line[i][2].toLong() * line[j][1]) / down
                val y = (line[i][2] * line[j][0].toLong()  - line[i][0].toLong() * line[j][2]) / down
                if(x.toLong().toDouble() == x && y.toLong().toDouble() == y)
                {
                    intersection += Pair(x.toLong(), y.toLong())
                }
            }
        val xm = intersection.minOf { it.first }
        val ym = intersection.minOf { it.second }
        val newIntersection = intersection.map { Pair(it.first - xm, it.second - ym) }
        val pos = Array(newIntersection.maxOf { it.second + 1}.toInt())
        {
            StringBuilder(".".repeat(newIntersection.maxOf { it.first + 1 }.toInt()))
        }
        newIntersection.forEach(){pos[it.second.toInt()][it.first.toInt()] = '*'}
        return pos.map { it.toString() }.reversed().toTypedArray()
    }
}