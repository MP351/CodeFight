package intro.divingdeeper

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FirstDigitKtTest {
    @Test
    fun firstDigit1() {
        val input = "var_1__Int"
        val output = '1'
        assertEquals(output, firstDigit(input))
    }
}