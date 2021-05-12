package thecore.bookmarket

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HTMLEndTagByStartTagKtTest {

    @Test
    fun htmlEndTagByStartTag1() {
        val input = "<button type='button' disabled>"
        val output = "</button>"
        assertEquals(output, htmlEndTagByStartTag(input))
    }

    @Test
    fun htmlEndTagByStartTag2() {
        val input = "<i>"
        val output = "</i>"
        assertEquals(output, htmlEndTagByStartTag(input))
    }
}