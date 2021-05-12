package thecore.labyrinthofnestedloops

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ComfortableNumbersKtTest {

    @Test
    fun comfortableNumbers1() {
        assertEquals(2, thecore.labyrinthofnestedloops.comfortableNumbers(10, 12))
    }

    @Test
    fun comfortableNumbers2() {
        assertEquals(20, thecore.labyrinthofnestedloops.comfortableNumbers(1, 9))
    }

    @Test
    fun comfortableNumbers3() {
        assertEquals(0, thecore.labyrinthofnestedloops.comfortableNumbers(13, 13))
    }

    @Test
    fun comfortableNumbers4() {
        assertEquals(707, thecore.labyrinthofnestedloops.comfortableNumbers(12, 108))
    }

    @Test
    fun comfortableNumbers5() {
        assertEquals(6166, thecore.labyrinthofnestedloops.comfortableNumbers(239, 777))
    }

    @Test
    fun comfortableNumbers6() {
        assertEquals(11435, thecore.labyrinthofnestedloops.comfortableNumbers(1, 1000))
    }
}
