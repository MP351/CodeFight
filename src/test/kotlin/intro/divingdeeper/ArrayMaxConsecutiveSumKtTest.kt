package intro.divingdeeper

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ArrayMaxConsecutiveSumKtTest {

    @Test
    fun arrayMaxConsecutiveSum1() {
        val input = mutableListOf(2, 3, 5, 1, 6)
        val k = 2
        val output = 8
        assertEquals(output, arrayMaxConsecutiveSum(input, k))
    }

    @Test
    fun arrayMaxConsecutiveSum2() {
        val input = mutableListOf(2, 4, 10, 1)
        val k = 2
        val output = 14
        assertEquals(output, arrayMaxConsecutiveSum(input, k))
    }

    @Test
    fun arrayMaxConsecutiveSum3() {
        val input = mutableListOf(1, 3, 2, 4)
        val k = 3
        val output = 9
        assertEquals(output, arrayMaxConsecutiveSum(input, k))
    }
}