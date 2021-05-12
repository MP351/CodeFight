package thecore.labyrinthofnestedloops

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RectangleRotationKtTest {

    @Test
    fun rectangleRotation1() {
        val a = 6
        val b = 4
        val output = 23
        assertEquals(output, rectangleRotation(a, b))
    }
}