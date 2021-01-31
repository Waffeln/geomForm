import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType
import kotlin.system.exitProcess

var horizStar = "***********************************************************"

fun geoChoice(form: String): Int{
    val input: String
    println("Welche Form vom Typ '$form' wollen Sie entfernen?")
    input = readLine().toString()

    return input.toInt()-1
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

    var dotArray = emptyArray<Dot>()
    var lineArray = emptyArray<Line>()
    var polygonArray = emptyArray<Polygon>()

    while(true) {
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
                    "1" -> dotArray = dotArray.plus(Dot())
                    "2" -> lineArray = lineArray.plus(Line())
                    "3" -> polygonArray = polygonArray.plus(Polygon())
                }
            }
            "2" -> {
                input = formChoice()
                when(input){
                    "1" -> dotArray = GeoForm.deleteForm(dotArray, geoChoice("Punkt")).toTypedArray()
                    "2" -> lineArray = GeoForm.deleteForm(lineArray, geoChoice("Linie")).toTypedArray()
                    "3" -> polygonArray = GeoForm.deleteForm(polygonArray, geoChoice("Polygon")).toTypedArray()
                }
            }
            "3" -> Output.geoOutput(dotArray)
            "4" -> Output.geoOutput(lineArray)
            "5" -> Output.geoOutput(polygonArray)
            "6" -> exitProcess(0)
        }

    }
    }