package thecore.labyrinthofnestedloops

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class WeakNumbersKtTest {

    @Test
    fun weakNumbers1() {
        val input = 9
        val output = mutableListOf(2, 2)
        assertEquals(output, weakNumbers(input))
    }

    @Test
    fun weakNumbers2() {
        val input = 1
        val output = mutableListOf(0, 1)
        assertEquals(output, weakNumbers(input))
    }

    @Test
    fun weakNumbers3() {
        val input = 2
        val output = mutableListOf(0, 2)
        assertEquals(output, weakNumbers(input))
    }

    @Test
    fun weakNumbers4() {
        val input = 7
        val output = mutableListOf(2, 1)
        assertEquals(output, weakNumbers(input))
    }

    @Test
    fun weakNumbers5() {
        val input = 500
        val output = mutableListOf(403, 1)
        assertEquals(output, weakNumbers(input))
    }

    @Test
    fun weakNumbers6() {
        val input = 4
        val output = mutableListOf(0, 4)
        assertEquals(output, weakNumbers(input))
    }
}