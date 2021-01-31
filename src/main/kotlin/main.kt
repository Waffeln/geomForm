var running = true
var horizStar = "***********************************************************"

fun geoChoice(form: String): Int{
    val input: String
    println("Welche Form vom Typ '$form' wollen Sie entfernen?")
    input = readLine().toString()

    return input.toInt()+1
}

fun formChoice(): String{
    val input: String
    println("Bitte wählen Sie den Geometrie-Typen:")
    println("1 -> Punkt")
    println("2 -> Linie")
    println("3 -> Polygon")
    input = readLine().toString()
    return input
}


fun main(args: Array<String>) {

    while(running) {
        println(horizStar)
        println("* Willkommen bei der Geometrien-Verwaltung!               *")
        println(horizStar)
        println("* Sie können folgende Befehle verwenden:                  *")
        println("*    1.eine Geometrie hinzufügen: insert-geom             *")
        println("*    2.eine Geometrie löschen: delete-geom                *")
        println("*    3.eine Liste von den Punkten anzeigen: points-list   *")
        println("*    4.eine Liste von den Punkten anzeigen: lines-list    *")
        println("*    5.eine Liste von den Punkten anzeigen: polygons-list *")
        println("*    6.Anwendung schließen                                *")
        println(horizStar)

        var input = readLine()

        when(input){
            "1" -> {
                input = formChoice()
                when(input){
                    "1" -> GeoData.pointList.plus(GeoData.makePoint())
                    "2" -> GeoData.lineList.plus(GeoData.makeLine())
                    "3" -> GeoData.polygonList.plus(GeoData.makePolygon())
                }
            }
            "2" -> {
                input = formChoice()
                when(input){
                    "1" -> {
                        GeoData.pointList = GeoData.deletePoint(GeoData.pointList, geoChoice("Punkt"))
                        println("Gelöscht.")
                        readLine()
                    }
                    "2" -> {
                        GeoData.lineList = GeoData.deleteLine(GeoData.lineList, geoChoice("Linie"))
                        println("Gelöscht.")
                        readLine()
                    }
                    "3" -> {
                        GeoData.polygonList = GeoData.deletePolygon(GeoData.polygonList, geoChoice("Polygon"))
                        println("Gelöscht.")
                        readLine()
                    }

                    }
            }
            "3" -> Output.showPointList(GeoData.pointList)
            "4" -> Output.showLineList(GeoData.lineList)
            "5" -> Output.showPolygonList(GeoData.polygonList)
            "6" -> running = false
        }

    }
    }