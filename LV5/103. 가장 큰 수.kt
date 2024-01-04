class Solution {
    fun solution(numbers: IntArray): String {
        var answer = ""
        val ns = numbers.map { it.toString() }.sortedWith(Comparator { o1, o2 ->  (o2 + o1).compareTo(o1 + o2)} )
            .forEach { answer += it }
        if(answer[0] == '0') answer = "0"
        return answer
    }
}