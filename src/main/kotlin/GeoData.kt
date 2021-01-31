class GeoDaten {
    companion object {
        var pointList = emptyList<Point>()
        var lineList = emptyList<Line>()
        var polygonList = emptyList<Polygon>()

        fun makePoint() {
            val lis = GeoForm.checkInput(1, 1, "Punkt")
            pointList = pointList.plus(Point(lis[0].x, lis[0].y))
            println(pointList[0].x)
            println("Gespeichert")
            readLine()
        }

        fun makeLine() {
            val lis = GeoForm.checkInput(10, 2, "Linie")

            for (i in lis) {
                lineList = lineList.plus(Line(lis))
            }

            println("Gespeichert")
            readLine()
        }

        fun makePolygon() {
            val lis = GeoForm.checkInput(20, 3, "Polygon")

            for (i in lis) {
                polygonList = polygonList.plus(Polygon(lis))
            }

            println("Gespeichert")
            readLine()
        }
    }
}