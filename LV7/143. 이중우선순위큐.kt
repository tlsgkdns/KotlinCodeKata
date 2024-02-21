import java.util.Collections
import java.util.PriorityQueue


class Solution {
    fun solution(operations: Array<String>): IntArray {
        val mn = PriorityQueue<Int>()
        val mx = PriorityQueue<Int>(Collections.reverseOrder())
        val del: MutableMap<Int, Int> = mutableMapOf()
        operations.forEach {
            val arr = it.split(" ")
            if(arr[0] == "I")
            {
                mn.add(arr[1].toInt())
                mx.add(arr[1].toInt())
            }
            else
            {
                if(arr[1].toInt() < 0)
                {
                    while (!mn.isEmpty() && del.contains(mn.peek()))
                    {
                        if(del[mn.peek()] == 1) del.remove(mn.peek())
                        else del[mn.peek()]?.minus(1)
                        mn.poll()
                    }
                    if(!mn.isEmpty())
                    {
                        mn.peek().let {now ->
                            del.put(now, (del[now] ?: 0) + 1)
                        }
                        mn.poll()
                    }
                }
                else
                {
                    while (!mx.isEmpty() && del.contains(mx.peek()))
                    {
                        if(del[mx.peek()] == 1) del.remove(mx.peek())
                        else del[mx.peek()]?.minus(1)
                        mx.poll()
                    }
                    if(!mx.isEmpty())
                    {
                        mx.peek().let {now ->
                            del.put(now, (del[now] ?: 0) + 1)
                        }
                        mx.poll()
                    }
                }
            }
        }
        var answer = intArrayOf(0, 0)
        while (!mx.isEmpty() && del.contains(mx.peek()))
        {
            if(del[mx.peek()] == 1) del.remove(mx.peek())
            else del[mx.peek()]?.minus(1)
            mx.poll()
        }
        while (!mn.isEmpty() && del.contains(mn.peek()))
        {
            if(del[mn.peek()] == 1) del.remove(mn.peek())
            else del[mn.peek()]?.minus(1)
            mn.poll()
        }
        if(!mn.isEmpty() && !mx.isEmpty()) answer = intArrayOf(mx.peek(), mn.peek())
        return answer
    }
}