package thecore.bookmarket

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IsCaseInsensitivePalindromeKtTest {

    @Test
    fun isCaseInsensitivePalindrome1() {
        val input = "AaBaa"
        assertTrue(isCaseInsensitivePalindrome(input))
    }

    @Test
    fun isCaseInsensitivePalindrome2() {
        val input = "abac"
        assertFalse(isCaseInsensitivePalindrome(input))
    }
}