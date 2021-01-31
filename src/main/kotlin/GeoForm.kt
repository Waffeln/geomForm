class GeoForm {
    companion object {

        fun sortCoordList(coordList: List<Point>,): List<Point>{
            val result = coordList.sortedByDescending {coordList -> coordList.x}
            return result
        }

        fun checkInput(max: Int, min: Int, type: String): List<Point> {
            println("Bitte geben Sie die Koordinaten des Geometrie-Typen '$type' ein und bestätigen Sie mit der Eingabe-Taste.")
            var inp: String = readLine().toString()
            var result = emptyList<Point>()
            var x = emptyList<Int>()
            var y = emptyList<Int>()

            var splitInp : List<String>
            splitInp = inp.split(";")

            if (splitInp[splitInp.size-1] == ""){
                splitInp = splitInp.minus("")
            }

            for (coords in splitInp){
                var xyCoord : List<String>
                xyCoord = coords.split(",")
                if (xyCoord[0][0] == ' '){
                    x= x.plus(xyCoord[0].split(" ")[1].toInt())
                }else {
                    x = x.plus(xyCoord[0].toInt())
                }
                y = y.plus(xyCoord[1].toInt())
            }

            for (i in 0..x.size-1){
                val point =Point(x[i],y[i])

                result = result.plus(point)
            }

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