package IslandOfKnowledge

import intro.islandofknowledge.minesweeper
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MinesweeperKtTest {

    @Test
    fun minesweeper1() {
        val input = mutableListOf(
            mutableListOf(true,false,false),
            mutableListOf(false,true,false),
            mutableListOf(false,false,false)
        )
        val output = mutableListOf(
            mutableListOf(1,2,1),
            mutableListOf(2,1,1),
            mutableListOf(1,1,1))
        assertEquals(output, minesweeper(input))
    }

    @Test
    fun minesweeper2() {
        val input = mutableListOf(
            mutableListOf(false,false,false),
            mutableListOf(false,false,false)
        )
        val output = mutableListOf(
            mutableListOf(0,0,0),
            mutableListOf(0,0,0))
        assertEquals(output, minesweeper(input))
    }

    @Test
    fun minesweeper3() {
        val input = mutableListOf(
            mutableListOf(true,false,false,true),
            mutableListOf(false,false,true,false),
            mutableListOf(true,true,false,true)
        )
        val output = mutableListOf(
            mutableListOf(0,2,2,1),
            mutableListOf(3,4,3,3),
            mutableListOf(1,2,3,1))
        assertEquals(output, minesweeper(input))
    }

    @Test
    fun minesweeper4() {
        val input = mutableListOf(
            mutableListOf(true,true,true),
            mutableListOf(true,true,true),
            mutableListOf(true,true,true)
        )
        val output = mutableListOf(
            mutableListOf(3,5,3),
            mutableListOf(5,8,5),
            mutableListOf(3,5,3))
        assertEquals(output, minesweeper(input))
    }

    @Test
    fun minesweeper5() {
        val input = mutableListOf(
            mutableListOf(false,true,true,false),
            mutableListOf(true,true,false,true),
            mutableListOf(false,false,true,false)
        )
        val output = mutableListOf(
            mutableListOf(3,3,3,2),
            mutableListOf(2,4,5,2),
            mutableListOf(2,3,2,2))
        assertEquals(output, minesweeper(input))
    }

    @Test
    fun minesweeper6() {
        val input = mutableListOf(
            mutableListOf(true,false),
            mutableListOf(true,false),
            mutableListOf(false,true),
            mutableListOf(false,false),
            mutableListOf(false,false)
        )
        val output = mutableListOf(
            mutableListOf(1,2),
            mutableListOf(2,3),
            mutableListOf(2,1),
            mutableListOf(1,1),
            mutableListOf(0,0))
        assertEquals(output, minesweeper(input))
    }


}