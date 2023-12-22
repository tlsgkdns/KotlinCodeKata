class Solution {
    var answer = 1000000007
    fun solve(sizes: Array<IntArray>, idx : Int, w: Int, h: Int)
    {
        if(idx == sizes.size)
        {
            if(answer > w * h)
                answer = w * h
            return
        }
        var tmpW = sizes[idx][0]
        var tmpH = sizes[idx][1]
        if((tmpW <= w && tmpH <= h) || (tmpH <= w && tmpW <= h))
        {
            solve(sizes, idx + 1, w, h)
        }
        else
        {
            var p1 = w; var p2 = h;
            if(tmpW > w) p1 = tmpW
            if(tmpH > h) p2 = tmpH
            solve(sizes, idx + 1, p1, p2)
            p1 = w; p2 = h
            if(tmpW > h) p2 = tmpW
            if(tmpH > w) p1 = tmpH
            solve(sizes, idx + 1, p1, p2)
        }
    }
    fun solution(sizes: Array<IntArray>): Int {
        solve(sizes, 0, 0, 0)
        return answer
    }
}