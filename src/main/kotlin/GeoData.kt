class GeoData {
    companion object {
        var pointList = emptyList<Point>()
        var lineList = emptyList<Line>()
        var polygonList = emptyList<Polygon>()

        fun makePoint() {
            val lis = GeoForm.checkInput(1, 1, "Punkt")
            pointList = pointList.plus(Point(lis[0].x, lis[0].y))
            println("Gespeichert")
            readLine()
        }

        fun makeLine() {
            val lis = GeoForm.checkInput(10, 2, "Linie")
            lineList = lineList.plus(Line(lis))

            println("Gespeichert")
            readLine()
        }

        fun makePolygon() {
            val lis = GeoForm.checkInput(20, 3, "Polygon")
            polygonList = polygonList.plus(Polygon(lis))

            println("Gespeichert")
            readLine()
        }

        fun deletePoint(gf: List<Point>, index: Int): List<Point>{
            return gf.minus(gf[index])
        }

        fun deleteLine(gf: List<Line>, index: Int): List<Line>{
            return gf.minus(gf[index])
        }

        fun deletePolygon(gf: List<Polygon>, index: Int): List<Polygon>{
            return gf.minus(gf[index])
        }
    }
}