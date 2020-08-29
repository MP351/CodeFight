package intro.eruptionoflight

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IsBeautifulStringKtTest {

    @Test
    fun isBeautifulString1() {
        val input = "bbbaacdafe"
        assertTrue(isBeautifulString(input))
    }

    @Test
    fun isBeautifulString2() {
        val input = "aabbb"
        assertFalse(isBeautifulString(input))
    }

    @Test
    fun isBeautifulString3() {
        val input = "bbc"
        assertFalse(isBeautifulString(input))
    }

    @Test
    fun isBeautifulString4() {
        val input = "bbbaa"
        assertFalse(isBeautifulString(input))
    }
}