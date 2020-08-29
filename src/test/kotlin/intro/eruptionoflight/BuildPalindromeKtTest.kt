package intro.eruptionoflight

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BuildPalindromeKtTest {

    @Test
    fun buildPalindrome() {
        val input = "abcdc"
        val output = "abcdcba"
        assertEquals(output, intro.eruptionoflight.buildPalindrome(input))
    }

    @Test
    fun isPalindrome1() {
        val input = "abc"
        assertFalse(isPalindrome(input))
    }

    @Test
    fun isPalindrome2() {
        val input = "aba"
        assertTrue(isPalindrome(input))
    }

    @Test
    fun isPalindrome3() {
        val input = "abcba"
        assertTrue(isPalindrome(input))
    }
}