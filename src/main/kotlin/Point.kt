class Point {
    var x: Int
    var y: Int

    init {
        val lis = GeoForm.checkInput(1, 1, "Punkt")

        x = lis[0].get(0)
        y = lis[1].get(0)

        println("Gespeichert")
        readLine()
    }

}