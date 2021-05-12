package thecore.labyrinthofnestedloops

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PagesNumberingWithInkKtTest {

    @Test
    fun pagesNumberingWithInk1() {
        val input = 1
        val nod = 5
        val output = 5
        assertEquals(output, pagesNumberingWithInk(input, nod))
    }

    @Test
    fun pagesNumberingWithInk2() {
        val input = 21
        val nod = 5
        val output = 22
        assertEquals(output, pagesNumberingWithInk(input, nod))
    }
}