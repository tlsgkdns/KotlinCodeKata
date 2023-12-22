class Solution {
    var months = arrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    var dates = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
    fun solution(a: Int, b: Int): String {
        var d = b - 1
        for(i in 0 .. a - 2)
            d += months[i]
        return dates[d % 7]
    }
}