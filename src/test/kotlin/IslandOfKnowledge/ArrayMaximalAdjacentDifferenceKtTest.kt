package IslandOfKnowledge

import intro.islandofknowledge.arrayMaximalAdjacentDifference
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ArrayMaximalAdjacentDifferenceKtTest {

    @Test
    fun arrayMaximalAdjacentDifference1() {
        val input = mutableListOf(2, 4, 1, 0)
        val output = 3
        assertEquals(output, arrayMaximalAdjacentDifference(input))
    }

    @Test
    fun arrayMaximalAdjacentDifference2() {
        val input = mutableListOf(1, 1, 1, 1)
        val output = 0
        assertEquals(output, arrayMaximalAdjacentDifference(input))
    }

    @Test
    fun arrayMaximalAdjacentDifference3() {
        val input = mutableListOf(-1, 4, 10, 3, -2)
        val output = 7
        assertEquals(output, arrayMaximalAdjacentDifference(input))
    }

    @Test
    fun arrayMaximalAdjacentDifference4() {
        val input = mutableListOf(10, 11, 13)
        val output = 2
        assertEquals(output, arrayMaximalAdjacentDifference(input))
    }

    @Test
    fun arrayMaximalAdjacentDifference5() {
        val input = mutableListOf(-2, -2, -2, -2, -2)
        val output = 0
        assertEquals(output, arrayMaximalAdjacentDifference(input))
    }

    @Test
    fun arrayMaximalAdjacentDifference6() {
        val input = mutableListOf(-1, 1, -3, -4)
        val output = 4
        assertEquals(output, arrayMaximalAdjacentDifference(input))
    }

    @Test
    fun arrayMaximalAdjacentDifference7() {
        val input = mutableListOf(-14, 15, -15)
        val output = 30
        assertEquals(output, arrayMaximalAdjacentDifference(input))
    }


}