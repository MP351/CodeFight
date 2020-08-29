package intro.rainsofreason

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ChessBoardCellColorKtTest {

    @Test
    fun chessBoardCellColor1() {
        val input1 = "A1"
        val input2 = "C3"
        assertTrue(chessBoardCellColor(input1, input2))
    }

    @Test
    fun chessBoardCellColor2() {
        val input1 = "A1"
        val input2 = "H3"
        assertFalse(chessBoardCellColor(input1, input2))
    }

    @Test
    fun chessBoardCellColor3() {
        val input1 = "A1"
        val input2 = "A2"
        assertFalse(chessBoardCellColor(input1, input2))
    }

    @Test
    fun chessBoardCellColor4() {
        val input1 = "A1"
        val input2 = "B2"
        assertTrue(chessBoardCellColor(input1, input2))
    }
}