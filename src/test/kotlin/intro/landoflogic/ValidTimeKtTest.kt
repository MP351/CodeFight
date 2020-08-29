package intro.landoflogic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ValidTimeKtTest {

    @Test
    fun validTime1() {
        val input = "13:58"
        assertTrue(validTime(input))
    }

    @Test
    fun validTime2() {
        val input = "25:51"
        assertFalse(validTime(input))
    }

    @Test
    fun validTime3() {
        val input = "02:76"
        assertFalse(validTime(input))
    }

    @Test
    fun validTime4() {
        val input = "24:00"
        assertFalse(validTime(input))
    }

    @Test
    fun validTime5() {
        val input = "02:61"
        assertFalse(validTime(input))
    }

    @Test
    fun validTime6() {
        val input = "27:00"
        assertFalse(validTime(input))
    }

    @Test
    fun validTime7() {
        val input = "19:66"
        assertFalse(validTime(input))
    }

    @Test
    fun validTime8() {
        val input = "12:31"
        assertTrue(validTime(input))
    }

    @Test
    fun validTime9() {
        val input = "25:73"
        assertFalse(validTime(input))
    }

    @Test
    fun validTime10() {
        val input = "09:56"
        assertTrue(validTime(input))
    }

    @Test
    fun validTime11() {
        val input = "03:29"
        assertTrue(validTime(input))
    }
}