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
                println("|${i+1} |${geoOutput(lL[i].points)}")
            }
            readLine()
        }

        fun showPolygonList(pL: List<Polygon>){
            println(head)
            for (i in 0.. pL.size-1){
                println("|${i+1} |${geoOutput(pL[i].points)}")
            }
            readLine()
        }

        fun geoOutput(coordList: List<Point>): String {
            var result = ""
            var sortedList = GeoForm.sortCoordList(coordList)
            for (i in 0.. coordList.size-1){
                result += (" ${sortedList[i].x},${sortedList[i].y};")
            }
            return result
        }
    }
}