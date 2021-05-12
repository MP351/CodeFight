package thecore.cornerofzeroesandones

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import thecore.looptunnel.candles

internal class CandlesKtTest {

    @Test
    fun candles1() {
        val input = 5
        val output = 9
        assertEquals(output, candles(input, 2))
    }
}