package intro.throughthefog

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CircleOfNumbersKtTest {

    @Test
    fun circleOfNumbers1() {
        val input = 10
        val fn = 2
        val output = 7
        assertEquals(output, circleOfNumbers(input, fn))
    }

    @Test
    fun circleOfNumbers2() {
        val input = 10
        val fn = 7
        val output = 2
        assertEquals(output, circleOfNumbers(input, fn))
    }

    @Test
    fun circleOfNumbers3() {
        val input = 4
        val fn = 1
        val output = 3
        assertEquals(output, circleOfNumbers(input, fn))
    }

    @Test
    fun circleOfNumbers4() {
        val input = 6
        val fn = 3
        val output = 0
        assertEquals(output, circleOfNumbers(input, fn))
    }

    @Test
    fun circleOfNumbers5() {
        val input = 18
        val fn = 6
        val output = 15
        assertEquals(output, circleOfNumbers(input, fn))
    }

    @Test
    fun circleOfNumbers6() {
        val input = 12
        val fn = 10
        val output = 4
        assertEquals(output, circleOfNumbers(input, fn))
    }

    @Test
    fun circleOfNumbers7() {
        val input = 18
        val fn = 5
        val output = 14
        assertEquals(output, circleOfNumbers(input, fn))
    }


}