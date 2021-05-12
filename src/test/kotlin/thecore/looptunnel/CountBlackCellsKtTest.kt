package thecore.looptunnel

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CountBlackCellsKtTest {

    @Test
    fun countBlackCells1() {
        val n = 3
        val m = 4
        val output = 6
        assertEquals(output, countBlackCells(n, m))
    }

    @Test
    fun countBlackCells2() {
        val n = 3
        val m = 3
        val output = 7
        assertEquals(output, countBlackCells(n, m))
    }

    @Test
    fun countBlackCells3() {
        val n = 2
        val m = 5
        val output = 6
        assertEquals(output, countBlackCells(n, m))
    }

    @Test
    fun countBlackCells4() {
        val n = 1
        val m = 1
        val output = 1
        assertEquals(output, countBlackCells(n, m))
    }

    @Test
    fun countBlackCells5() {
        val n = 1
        val m = 2
        val output = 2
        assertEquals(output, countBlackCells(n, m))
    }

    @Test
    fun countBlackCells6() {
        val n = 1
        val m = 3
        val output = 3
        assertEquals(output, countBlackCells(n, m))
    }

    @Test
    fun countBlackCells7() {
        val n = 1
        val m = 239
        val output = 239
        assertEquals(output, countBlackCells(n, m))
    }

    @Test
    fun countBlackCells8() {
        val n = 33
        val m = 44
        val output = 86
        assertEquals(output, countBlackCells(n, m))
    }

    @Test
    fun countBlackCells9() {
        val n = 16
        val m = 8
        val output = 30
        assertEquals(output, countBlackCells(n, m))
    }

    @Test
    fun countBlackCells10() {
        val n = 66666
        val m = 88888
        val output = 177774
        assertEquals(output, countBlackCells(n, m))
    }

    @Test
    fun countBlackCells_my1() {
        val n = 100
        val m = 1
        val output = 100
        assertEquals(output, countBlackCells(n, m))
    }

    @Test
    fun countBlackCells_my2() {
        val n = 5
        val m = 16
        val output = 30
        assertEquals(output, countBlackCells(n, m))
    }
}