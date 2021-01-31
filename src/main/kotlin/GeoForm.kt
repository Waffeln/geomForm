open class GeoForm {
    companion object {

        fun <T>deleteForm(gf: Array<T>, index: Int): List<T>{
            return gf.drop(index)
        }

        fun checkInput(max: Int, min: Int, type: String): Array<Array<Int>> {
            println("Bitte geben Sie die Koordinaten des Geometrie-Typen '$type' ein und bestätigen Sie mit der Eingabe-Taste.")
            val inp: String = readLine().toString()
            var count = 0
            var result = emptyArray<Array<Int>>()
            var x = emptyArray<Int>()
            var y = emptyArray<Int>()

            if (inp[inp.length - 1] != ';') {
                ++count
            }

            for (i in 0..inp.length - 1) {
                if (inp[i] == ';') {
                    ++count
                }
            }

            if (count >= min && count <= max) {
                count = 0
                var numSafe = ""

                for (i in 0..(inp.length - 1)) {
                    if (inp[i].isDigit()) {
                        numSafe += inp[i]
                    } else if (inp[i] == ',') {
                        x = x.plus(numSafe.toInt())
                        numSafe = ""
                    } else if (inp[i] == ';') {
                        y = y.plus(numSafe.toInt())
                        numSafe = ""
                        ++count
                    }
                }

                if (inp[inp.length - 1].isDigit()) {
                    y = y.plus(numSafe.toInt())
                    ++count
                }

                result = result.plus(x)
                result = result.plus(y)
            }

            if (count < min) {
                println("Fehler! Eine Geometrie vom Typ '$type' muss mindestens $min Koordinatenpaare haben. Bitte versuchen Sie es erneut.")
                result = checkInput(max, min, type)
            } else if (count > max) {
                println("Feler! Eine Geometrie vom Typ '$type' darf nur maximal $max Koordinatenpaare haben. Bitte versuchen Sie es erneut.")
                result = checkInput(max, min, type)
            }
            return result
        }
    }
}