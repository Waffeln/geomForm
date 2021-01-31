class Dot : GeoForm() {
    var x: Int
    var y: Int

    init {
        val arr = checkInput(1, 1, "Punkt")

        x = arr[0].get(0)
        y = arr[1].get(0)

        println("Gespeichert")
        readLine()
    }

    fun deleteForm(gf: Array<Dot>, index: Int): Array<Dot>{
        return gf.drop(index).toTypedArray()
    }

}