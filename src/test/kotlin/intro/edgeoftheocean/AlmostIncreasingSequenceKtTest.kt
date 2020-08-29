package intro.edgeoftheocean

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class AlmostIncreasingSequenceKtTest {
    @Test
    fun almostIncreasingSequence1() {
        val input = mutableListOf(1, 3, 2, 1)
        assertFalse(almostIncreasingSequence(input))
    }

    @Test
    fun almostIncreasingSequence2() {
        val input = mutableListOf(1, 3, 2)
        assertTrue(almostIncreasingSequence(input))
    }

    @Test
    fun almostIncreasingSequence3() {
        val input = mutableListOf(1, 2, 1, 2)
        assertFalse(almostIncreasingSequence(input))
    }
}