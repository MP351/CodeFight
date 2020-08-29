import intro.exploringthewaters.palindromeRearranging
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PalindromeRearrangingKtTest {
    @Test
    fun palindromeRearranging1() {
        val input = "aabb"
        val output = true
        assertEquals(output, palindromeRearranging(input))
    }

    @Test
    fun palindromeRearranging2() {
        val input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"
        val output = false
        assertEquals(output, palindromeRearranging(input))
    }

    @Test
    fun palindromeRearranging3() {
        val input = "abbcabb"
        val output = true
        assertEquals(output, palindromeRearranging(input))
    }

    @Test
    fun palindromeRearranging4() {
        val input = "zyyzzzzz"
        val output = true
        assertEquals(output, palindromeRearranging(input))
    }

    @Test
    fun palindromeRearranging5() {
        val input = "z"
        val output = true
        assertEquals(output, palindromeRearranging(input))
    }

    @Test
    fun palindromeRearranging6() {
        val input = "zaa"
        val output = true
        assertEquals(output, palindromeRearranging(input))
    }

    @Test
    fun palindromeRearranging7() {
        val input = "abca"
        val output = false
        assertEquals(output, palindromeRearranging(input))
    }

    @Test
    fun palindromeRearranging8() {
        val input = "abcad"
        val output = false
        assertEquals(output, palindromeRearranging(input))
    }

    @Test
    fun palindromeRearranging9() {
        val input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa"
        val output = false
        assertEquals(output, palindromeRearranging(input))
    }

    @Test
    fun palindromeRearranging10() {
        val input = "abdhuierf"
        val output = false
        assertEquals(output, palindromeRearranging(input))
    }
}