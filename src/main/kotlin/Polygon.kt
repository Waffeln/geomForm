class Polygon {

    var x: List<Int>
    var y: List<Int>

    init {
        x= emptyList()
        y= emptyList()
        val lis = GeoForm.checkInput(20, 3, "Polygon")

        for(values in lis[0]){
            x = x.plus(values)
        }

        for (values in lis[1]){
            y = y.plus(values)
        }
        println("Gespeichert")
    }

}