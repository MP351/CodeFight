package intro.rainbowofclarity

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DeleteDigitKtTest {

    @Test
    fun deleteDigit1() {
        val input = 152
        val output = 52
        assertEquals(output, deleteDigit(input))
    }

    @Test
    fun deleteDigit2() {
        val input = 1001
        val output = 101
        assertEquals(output, deleteDigit(input))
    }

    @Test
    fun deleteDigit3() {
        val input = 10
        val output = 1
        assertEquals(output, deleteDigit(input))
    }

    @Test
    fun deleteDigit4() {
        val input = 222219
        val output = 22229
        assertEquals(output, deleteDigit(input))
    }

    @Test
    fun deleteDigit5() {
        val input = 109
        val output = 19
        assertEquals(output, deleteDigit(input))
    }


}