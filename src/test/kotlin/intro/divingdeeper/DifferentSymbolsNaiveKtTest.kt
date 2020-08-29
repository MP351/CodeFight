package intro.divingdeeper

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DifferentSymbolsNaiveKtTest {

    @Test
    fun differentSymbolsNaive1() {
        val input = "cabca"
        val output = 3
        assertEquals(output, differentSymbolsNaive(input))
    }
}