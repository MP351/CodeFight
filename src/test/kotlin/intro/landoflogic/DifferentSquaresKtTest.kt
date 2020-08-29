package intro.landoflogic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DifferentSquaresKtTest {

    @Test
    fun differentSquares1() {
        val input = mutableListOf(
                mutableListOf(1,2,1),
                mutableListOf(2,2,2),
                mutableListOf(2,2,2),
                mutableListOf(1,2,3),
                mutableListOf(2,2,1)
        )
        val output = 6
        assertEquals(output, differentSquares(input))
    }
}