var head = "|id | Koordinaten\n-------------------------------------------"
class Output {
    companion object {

        fun showPointList(pL: List<Point>){
            println(head)
            for (i in 0.. pL.size-1){
                println("|${i+1} | ${pL[i].x},${pL[i].y}")
            }
            readLine()
        }

        fun showLineList(lL: List<Line>){
            println(head)
            for (i in 0.. lL.size-1){
                println("|${i+1} |${geoOutput(listOf(lL[i].x, lL[i].y))}")
            }
            readLine()
        }

        fun showPolygonList(pL: List<Polygon>){
            println(head)
            for (i in 0.. pL.size-1){
                println("|${i+1} |${geoOutput(listOf(pL[i].x, pL[i].y))}")
            }
            readLine()
        }

        fun geoOutput(coordList: List<List<Int>>): String {
            var result = ""
            for (i in 0.. coordList[0].size-1){
                result += (" ${coordList[0][i]},${coordList[1][i]};")
            }
            return result
        }
    }
}