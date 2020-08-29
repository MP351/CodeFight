package intro.rainbowofclarity

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ChessKnightKtTest {

    @Test
    fun chessKnight1() {
        val input = "a1"
        val output = 2
        assertEquals(output, chessKnight(input))
    }

    @Test
    fun chessKnight2() {
        val input = "c2"
        val output = 6
        assertEquals(output, chessKnight(input))
    }

    @Test
    fun chessKnight3() {
        val input = "d4"
        val output = 8
        assertEquals(output, chessKnight(input))
    }

    @Test
    fun chessKnight4() {
        val input = "g6"
        val output = 6
        assertEquals(output, chessKnight(input))
    }
}