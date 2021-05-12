package thecore.cornerofzeroesandones

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import thecore.looptunnel.rounders

internal class RoundersKtTest {

    @Test
    fun rounders1() {
        val input = 15
        val output = 20
        assertEquals(output, rounders(input))
    }

    @Test
    fun rounders3() {
        val input = 1445
        val output = 2000
        assertEquals(output, rounders(input))
    }

    @Test
    fun rounders_hid8() {
        val input = 12345678
        val output = 10000000
        assertEquals(output, rounders(input))
    }

    @Test
    fun rounders_own1() {
        val input = 5
        val output = 5
        assertEquals(output, rounders(input))
    }
}