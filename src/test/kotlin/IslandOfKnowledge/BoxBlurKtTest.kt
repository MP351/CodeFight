package IslandOfKnowledge

import intro.islandofknowledge.boxBlur
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BoxBlurKtTest {

    @Test
    fun boxBlur1() {
        val input = mutableListOf(
            mutableListOf(1, 1, 1),
            mutableListOf(1, 7, 1),
            mutableListOf(1, 1, 1)
        )
        val output = mutableListOf(mutableListOf(1))
        assertEquals(output, boxBlur(input))
    }

    @Test
    fun boxBlur2() {
        val input = mutableListOf(
            mutableListOf(0,18,9),
            mutableListOf(27,9,0),
            mutableListOf(81,63,45)
        )
        val output = mutableListOf(mutableListOf(28))
        assertEquals(output, boxBlur(input))
    }

    @Test
    fun boxBlur3() {
        val input = mutableListOf(
            mutableListOf(36,0,18,9),
            mutableListOf(27,54,9,0),
            mutableListOf(81,63,72,45)
        )
        val output = mutableListOf(mutableListOf(40, 30))
        assertEquals(output, boxBlur(input))
    }

    @Test
    fun boxBlur4() {
        val input = mutableListOf(
            mutableListOf(7,4,0,1),
            mutableListOf(5,6,2,2),
            mutableListOf(6,10,7,8),
            mutableListOf(1,4,2,0)
        )
        val output = mutableListOf(
            mutableListOf(5, 4),
            mutableListOf(4, 4))
        assertEquals(output, boxBlur(input))
    }

    @Test
    fun boxBlur5() {
        val input = mutableListOf(
            mutableListOf(36,0,18,9,9,45,27),
            mutableListOf(27,0,54,9,0,63,90),
            mutableListOf(81,63,72,45,18,27,0),
            mutableListOf(0,0,9,81,27,18,45),
            mutableListOf(45,45,27,27,90,81,72),
            mutableListOf(45,18,9,0,9,18,45),
            mutableListOf(27,81,36,63,63,72,81)
        )
        val output = mutableListOf(
            mutableListOf(39,30,26,25,31),
            mutableListOf(34,37,35,32,32),
            mutableListOf(38,41,44,46,42),
            mutableListOf(22,24,31,39,45),
            mutableListOf(37,34,36,47,59)
        )
        assertEquals(output, boxBlur(input))
    }

    @Test
    fun boxBlur6() {
        val input = mutableListOf(
            mutableListOf(36,0,18,9,9,45,27),
            mutableListOf(27,0,254,9,0,63,90),
            mutableListOf(81,255,72,45,18,27,0),
            mutableListOf(0,0,9,81,27,18,45),
            mutableListOf(45,45,227,227,90,81,72),
            mutableListOf(45,18,9,255,9,18,45),
            mutableListOf(27,81,36,127,255,72,81)
        )
        val output = mutableListOf(
            mutableListOf(82,73,48,25,31),
            mutableListOf(77,80,57,32,32),
            mutableListOf(81,106,88,68,42),
            mutableListOf(44,96,103,89,45),
            mutableListOf(59,113,137,126,80)
        )
        assertEquals(output, boxBlur(input))
    }


}