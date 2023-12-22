class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var cmd = routes.map{it.split(" ")}
        var sy = 0; var sx = 0;
        for((y, p) in park.withIndex())
        {
            val x = (p.indexOfFirst { it == 'S' })
            if(x >= 0)
            {
                sy = y; sx = x;
                break
            }
        }
        for(c in cmd)
        {
            var br = false
            when(c[0])
            {
                "E" -> {
                    var nx = sx
                    for(i in 1.. c[1].toInt())
                    {
                        if(nx + 1 >= park[sy].length || park[sy][nx + 1] == 'X')
                        {
                            br = true
                            break
                        }
                        ++nx
                    }
                    if(!br)
                    {
                        sx = nx
                    }
                }
                "S" -> {
                    var ny = sy
                    for(i in 1.. c[1].toInt())
                    {
                        if(ny + 1 >= park.size || park[ny + 1][sx] == 'X')
                        {
                            br = true
                            break
                        }
                        ++ny
                    }
                    if(!br)
                    {
                        sy = ny
                    }
                }

                "W" -> {
                    var nx = sx
                    for(i in 1.. c[1].toInt())
                    {
                        if(nx - 1 < 0 || park[sy][nx - 1] == 'X')
                        {
                            br = true
                            break
                        }
                        --nx
                    }
                    if(!br)
                    {
                        sx = nx
                    }
                }
                "N" -> {
                    var ny = sy
                    for(i in 1.. c[1].toInt())
                    {
                        if(ny - 1 < 0 || park[ny - 1][sx] == 'X')
                        {
                            br = true
                            break
                        }
                        --ny
                    }
                    if(!br)
                    {
                        sy = ny
                    }
                }
            }
        }
        var answer = intArrayOf(sy, sx)
        return answer
    }
}