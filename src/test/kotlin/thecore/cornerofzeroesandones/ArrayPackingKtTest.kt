package thecore.cornerofzeroesandones

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ArrayPackingKtTest {

    @Test
    fun arrayPacking1() {
        val input = mutableListOf(24, 85, 0)
        val output = 21784
        assertEquals(output, arrayPacking(input))
    }
}