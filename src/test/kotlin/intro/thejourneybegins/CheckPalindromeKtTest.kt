package intro.thejourneybegins

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CheckPalindromeKtTest {

    @Test
    fun checkPalindrome1() {
        val input = "aabaa"
        assertTrue(checkPalindrome(input))
    }

    @Test
    fun checkPalindrome2() {
        val input = "abac"
        assertFalse(checkPalindrome(input))
    }

    @Test
    fun checkPalindrome3() {
        val input = "a"
        assertTrue(checkPalindrome(input))
    }
}