package IslandOfKnowledge

import intro.islandofknowledge.avoidObstacles
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class AvoidObstaclesKtTest {

    @Test
    fun avoidObstacles1() {
        val input = mutableListOf(5, 3, 6, 7, 9)
        val output = 4
        assertEquals(output, avoidObstacles(input))
    }

    @Test
    fun avoidObstacles2() {
        val input = mutableListOf(2, 3)
        val output = 4
        assertEquals(output, avoidObstacles(input))
    }

    @Test
    fun avoidObstacles3() {
        val input = mutableListOf(1, 4, 10, 6, 2)
        val output = 7
        assertEquals(output, avoidObstacles(input))
    }

    @Test
    fun avoidObstacles4() {
        val input = mutableListOf(1000, 999)
        val output = 6
        assertEquals(output, avoidObstacles(input))
    }

    @Test
    fun avoidObstacles5() {
        val input = mutableListOf(19, 32, 11, 23)
        val output = 3
        assertEquals(output, avoidObstacles(input))
    }

    @Test
    fun avoidObstacles6() {
        val input = mutableListOf(5, 8, 9, 13, 14)
        val output = 6
        assertEquals(output, avoidObstacles(input))
    }
}