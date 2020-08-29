package intro.edgeoftheocean

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MakeArrayConsecutive2KtTest {
    @Test
    fun makeArrayConsecutive2_1() {
        val input = mutableListOf(6, 2, 3, 8)
        val output = 3
        assertEquals(output, makeArrayConsecutive2(input))
    }

    @Test
    fun makeArrayConsecutive2_2() {
        val input = mutableListOf(0, 3)
        val output = 2
        assertEquals(output, makeArrayConsecutive2(input))
    }
}