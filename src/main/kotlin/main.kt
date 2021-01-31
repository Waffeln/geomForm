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
                    "1" -> GeoDaten.pointList.plus(GeoDaten.makePoint())
                    "2" -> GeoDaten.lineList.plus(GeoDaten.makeLine())
                    "3" -> GeoDaten.polygonList.plus(GeoDaten.makePolygon())
                }
            }
            "2" -> {
                input = formChoice()
                when(input){
                    "1" -> {
                        GeoDaten.pointList = GeoForm.deletePoint(GeoDaten.pointList, geoChoice("Punkt"))
                        println("Gelöscht.")
                        readLine()
                    }
                    "2" -> {
                        GeoDaten.lineList = GeoForm.deleteLine(GeoDaten.lineList, geoChoice("Linie"))
                        println("Gelöscht.")
                        readLine()
                    }
                    "3" -> {
                        GeoDaten.polygonList = GeoForm.deletePolygon(GeoDaten.polygonList, geoChoice("Polygon"))
                        println("Gelöscht.")
                        readLine()
                    }

                    }
            }
            "3" -> Output.showPointList(GeoDaten.pointList)
            "4" -> Output.showLineList(GeoDaten.lineList)
            "5" -> Output.showPolygonList(GeoDaten.polygonList)
            "6" -> running = false
        }

    }
    }