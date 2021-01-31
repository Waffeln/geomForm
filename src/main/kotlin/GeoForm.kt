class GeoForm {
    companion object {

        fun deletePoint(gf: List<Point>, index: Int): List<Point>{
            return gf.drop(index)
        }

        fun deleteLine(gf: List<Line>, index: Int): List<Line>{
            return gf.drop(index)
        }

        fun deletePolygon(gf: List<Polygon>, index: Int): List<Polygon>{
            return gf.drop(index)
        }

        fun checkInput(max: Int, min: Int, type: String): List<List<Int>> {
            println("Bitte geben Sie die Koordinaten des Geometrie-Typen '$type' ein und bestätigen Sie mit der Eingabe-Taste.")
            val inp: String = readLine().toString()
            var result: List<List<Int>>
            var x = emptyList<Int>()
            var y = emptyList<Int>()

            var splitInp : List<String>
            splitInp = inp.split(";")

            if (splitInp[splitInp.size-1]== ""){
                splitInp = splitInp.drop(splitInp.size-1)
            }

            for (coords in splitInp){
                var xyCoord : List<String>
                xyCoord = coords.split(",")
                x = x.plus(xyCoord[0].toInt())
                y = y.plus(xyCoord[1].toInt())
            }

            result = listOf(x,y)

            if (x.size < min) {
                println("Fehler! Eine Geometrie vom Typ '$type' muss mindestens $min Koordinatenpaare haben. Bitte versuchen Sie es erneut.")
                result = checkInput(max, min, type)
            } else if (x.size > max) {
                println("Feler! Eine Geometrie vom Typ '$type' darf nur maximal $max Koordinatenpaare haben. Bitte versuchen Sie es erneut.")
                result = checkInput(max, min, type)
            }

            return result
        }
    }
}