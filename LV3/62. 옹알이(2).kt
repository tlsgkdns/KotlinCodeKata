var babble = arrayOf("aya", "ye", "woo", "ma")

fun main()
{
    var answer: Int = 0
    for(B in babbling)
    {
        var idx = 0
        var br = true
        while(idx < B.length)
        {
            var prev = ""
            for(w in babble)
            {
                if(w != prev && idx + w.length <= B.length && w == B.substring(idx, idx + w.length))
                {
                    prev = w
                    idx += w.length + 1
                    br = false
                    break
                }
            }
            if(br) break
        }
        if(!br) ++answer
    }
    return answer
}