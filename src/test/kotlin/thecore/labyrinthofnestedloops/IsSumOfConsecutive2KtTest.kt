package thecore.labyrinthofnestedloops

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IsSumOfConsecutive2KtTest {

    @Test
    fun isSumOfConsecutive2_1() {
        val input = 9
        val output = 2
        assertEquals(output, isSumOfConsecutive2(input))
    }

    @Test
    fun isSumOfConsecutive2_3() {
        val input = 15
        val output = 3
        assertEquals(output, isSumOfConsecutive2(input))
    }

    @Test
    fun isSumOfConsecutive2_7() {
        val input = 99
        val output = 5
        assertEquals(output, isSumOfConsecutive2(input))
    }
}