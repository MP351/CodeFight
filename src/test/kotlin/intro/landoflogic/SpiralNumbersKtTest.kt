package intro.landoflogic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SpiralNumbersKtTest {

    @Test
    fun spiralNumbers1() {
        val input = 3
        val output = mutableListOf(
                mutableListOf(1, 2, 3),
                mutableListOf(8, 9, 4),
                mutableListOf(7, 6, 5)
        )
        assertEquals(output, spiralNumbers(input))
    }
}