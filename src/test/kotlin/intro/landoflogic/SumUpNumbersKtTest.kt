package intro.landoflogic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SumUpNumbersKtTest {

    @Test
    fun sumUpNumbers1() {
        val input = "2 apples, 12or"
        val output = 14
        assertEquals(output, sumUpNumbers(input))
    }

    @Test
    fun sumUpNumbers2() {
        val input = "123450"
        val output = 123450
        assertEquals(output, sumUpNumbers(input))
    }
}