package intro.darkwilderness

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GrowingPlantKtTest {
    @Test
    fun growingPlant1() {
        assertEquals(10, growingPlant(100, 10, 910))
    }

    @Test
    fun growingPlant2() {
        assertEquals(1, growingPlant(10, 9, 4))
    }

    @Test
    fun growingPlant3() {
        assertEquals(2, growingPlant(5, 2, 7))
    }
}