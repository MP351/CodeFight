import intro.smoothsailing.reverseInParentheses
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ReverseInParenthesesKtTest {
    @Test
    fun reverseInParentheses1() {
        val input = "(bar)"
        val expected = "rab"
        assertEquals(expected, reverseInParentheses(input))
    }

    @Test
    fun reverseInParentheses2() {
        val input = "foo(bar)baz"
        val expected = "foorabbaz"
        assertEquals(expected, reverseInParentheses(input))
    }

    @Test
    fun reverseInParentheses3() {
        val input = "foo(bar)baz(blim)"
        val expected = "foorabbazmilb"
        assertEquals(expected, reverseInParentheses(input))
    }

    @Test
    fun reverseInParentheses4() {
        val input = "foo(bar(baz))blim"
        val expected = "foobazrabblim"
        assertEquals(expected, reverseInParentheses(input))
    }

    @Test
    fun reverseInParentheses5() {
        val input = ""
        val expected = ""
        assertEquals(expected, reverseInParentheses(input))
    }

    @Test
    fun reverseInParentheses6() {
        val input = "()"
        val expected = ""
        assertEquals(expected, reverseInParentheses(input))
    }

    @Test
    fun reverseInParentheses7() {
        val input = "(abc)d(efg)"
        val expected = "cbadgfe"
        assertEquals(expected, reverseInParentheses(input))
    }
}