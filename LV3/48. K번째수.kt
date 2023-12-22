class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        for(cmd in commands)
        {
            var sub = array.copyOfRange(cmd[0] - 1, cmd[1])
            sub.sort()
            answer += sub[cmd[2] - 1]
        }
        return answer
    }
}