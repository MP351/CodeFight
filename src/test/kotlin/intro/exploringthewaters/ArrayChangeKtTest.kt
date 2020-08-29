package intro.exploringthewaters

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ArrayChangeKtTest {

    @Test
    fun arrayChange1() {
        val input = mutableListOf(1, 1, 1)
        val output = 3
        assertEquals(output, arrayChange(input))
    }
}