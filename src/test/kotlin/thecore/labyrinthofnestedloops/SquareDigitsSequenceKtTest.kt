package thecore.labyrinthofnestedloops

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SquareDigitsSequenceKtTest {

    @Test
    fun squareDigitsSequence1() {
        val input = 16
        val output = 9
        assertEquals(output, squareDigitsSequence(input))
    }

    @Test
    fun squareDigitsSequence2() {
        val input = 103
        val output = 4
        assertEquals(output, squareDigitsSequence(input))
    }
}