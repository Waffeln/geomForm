import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Tests {

    val testP0 = Point(3,5)
    val testP1 = Point(6,1)
    val testP2 = Point(1,3)

    val testL0 = listOf<Point>(testP0,testP1,testP2)

    @Test fun GeoFormSortCoordTest(){
        val testL1 = listOf<Point>(testP1,testP0,testP2)
        assertEquals(GeoForm.sortCoordList(testL0),testL1, "Sortierung Fehlgeschlagen")
    }

    @Test fun GeoDataDeletePointTest(){
        val testL1 = listOf<Point>(testP0,testP2)
        assertEquals(GeoData.deletePoint(testL0, 1), testL1, "Auschließlich 2. Punkt wurde nicht gelöscht")
    }


}