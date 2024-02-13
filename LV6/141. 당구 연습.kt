import kotlin.math.*
class Solution {
    fun solution(m: Int, n: Int, startX: Int, startY: Int, balls: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        val nearX = min(startX, m - startX)
        val nearY = min(startY, n - startY)
        balls.forEach {
                (x, y) ->
            if(x == startX)
            {
                val d1 = (startY - y) * (startY - y) + 4 * nearX * nearX
                val d2 = if(startY < y) (y + startY) * (y + startY) else (2 * n - startY - y) * (2 * n - startY - y)
                answer += min(d1, d2)
            } else if(y == startY)
            {
                val d1 = (startX - x) * (startX - x) + 4 * nearY * nearY
                val d2 = if(startX < x) (x + startX) * (startX + x) else (2 * m - startX - x) * (2 * m - startX - x)
                answer += min(d1, d2)
            }
            else
            {
                val d1 = (x - startX) * (x - startX) + (y + startY) * (y + startY)
                val d2 = (x + startX) * (x + startX) + (y - startY) * (y - startY)
                val d3 = (y - startY) * (y - startY) + (2 * m - startX - x) * (2 * m - startX - x)
                val d4 = (x - startX) * (x - startX) + (2 * n - startY - y) * (2 * n - startY - y)
                answer += min(min(d1, d2), min(d3, d4))
            }
        }
        return answer
    }
}