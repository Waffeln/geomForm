class Line : GeoForm {
    var x: Array<Int>
    var y: Array<Int>

    init {
        x= emptyArray()
        y= emptyArray()
        val arr = super.checkInput(10, 2, "Linie")

        println("array ist " + arr.size)
        for(values in arr[0]){
            x = x.plus(values)
        }

        for (values in arr[1]){
            y = y.plus(values)
        }
    }
}