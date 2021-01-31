class Line {
    var x: List<Int>
    var y: List<Int>

    init {
        x= emptyList()
        y= emptyList()
        val lis = GeoForm.checkInput(10, 2, "Linie")

        for(values in lis[0]){
            x = x.plus(values)
        }

        for (values in lis[1]){
            y = y.plus(values)
        }
        println("Gespeichert")
        readLine()
    }

}