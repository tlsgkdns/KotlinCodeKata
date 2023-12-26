import java.util.Stack

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        for(sIdx in s.indices)
        {
            val st = Stack<Char>()
            var f = true
            for(cnt in s.indices)
            {
                val nIdx = (sIdx + cnt) % s.length
                if(s[nIdx] == '}' || s[nIdx] == ')' || s[nIdx] == ']')
                {
                    if(st.empty() || st.peek() != s[nIdx])
                    {
                        f = false
                        break
                    }
                    else
                        st.pop()
                }
                else
                {
                    when(s[nIdx])
                    {
                        '{' -> st.push('}')
                        '[' -> st.push(']')
                        '(' -> st.push(')')
                    }
                }
            }
            if(f && st.empty()) ++answer
        }
        return answer
    }
}