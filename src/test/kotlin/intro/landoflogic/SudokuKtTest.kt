package intro.landoflogic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SudokuKtTest {

    @Test
    fun sudoku1() {
        val input = mutableListOf(
                mutableListOf(1,3,2,5,4,6,9,8,7),
                mutableListOf(4,6,5,8,7,9,3,2,1),
                mutableListOf(7,9,8,2,1,3,6,5,4),
                mutableListOf(9,2,1,4,3,5,8,7,6),
                mutableListOf(3,5,4,7,6,8,2,1,9),
                mutableListOf(6,8,7,1,9,2,5,4,3),
                mutableListOf(5,7,6,9,8,1,4,3,2),
                mutableListOf(2,4,3,6,5,7,1,9,8),
                mutableListOf(8,1,9,3,2,4,7,6,5)
        )
        assertTrue(sudoku(input))
    }

    @Test
    fun sudoku4() {
        val input = mutableListOf(
                mutableListOf(1,3,4,2,5,6,9,8,7),
                mutableListOf(4,6,8,5,7,9,3,2,1),
                mutableListOf(7,9,2,8,1,3,6,5,4),
                mutableListOf(9,2,3,1,4,5,8,7,6),
                mutableListOf(3,5,7,4,6,8,2,1,9),
                mutableListOf(6,8,1,7,9,2,5,4,3),
                mutableListOf(5,7,6,9,8,1,4,3,2),
                mutableListOf(2,4,5,6,3,7,1,9,8),
                mutableListOf(8,1,9,3,2,4,7,6,5)
        )
        assertFalse(sudoku(input))
    }
}