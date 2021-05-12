package thecore.cornerofzeroesandones

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import thecore.looptunnel.lineUp

internal class LineUpKtTest {

    @Test
    fun lineUp1() {
        val input = "LLARL"
        assertEquals(3, lineUp(input))
    }

    @Test
    fun lineUp2() {
        val input = "RLR"
        assertEquals(1, lineUp(input))
    }

    @Test
    fun lineUp3() {
        val input = ""
        assertEquals(0, lineUp(input))
    }

    @Test
    fun lineUp4() {
        val input = "L"
        assertEquals(0, lineUp(input))
    }

    @Test
    fun lineUp5() {
        val input = "A"
        assertEquals(1, lineUp(input))
    }

    @Test
    fun lineUp7() {
        val input = "RRRRRRRRRRLLLLLLLLLRRRRLLLLLLLLLL"
        assertEquals(16, lineUp(input))
    }

    @Test
    fun lineUp8() {
        val input = "AALAAALARAR"
        assertEquals(5, lineUp(input))
    }
}