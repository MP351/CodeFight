package intro.darkwilderness

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class LongestDigitsPrefixKtTest {

    @Test
    fun longestDigitsPrefix1() {
        val input = "123aa1"
        val output = "123"
        assertEquals(output, longestDigitsPrefix(input))
    }

    @Test
    fun longestDigitsPrefix3() {
        val input = "  3) always check for whitespaces"
        val output = ""
        assertEquals(output, longestDigitsPrefix(input))
    }
}