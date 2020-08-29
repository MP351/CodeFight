package intro.divingdeeper

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ExtractEachKthKtTest {

    @Test
    fun extractEachKth1() {
        val inputArray = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val num = 3
        val output = mutableListOf(1, 2, 4, 5, 7, 8, 10)
        assertEquals(output, extractEachKth(inputArray, num))
    }

    @Test
    fun extractEachKth2() {
        val inputArray = mutableListOf(1, 1, 1, 1, 1)
        val num = 1
        val output = mutableListOf<Int>()
        assertEquals(output, extractEachKth(inputArray, num))
    }

    @Test
    fun extractEachKth3() {
        val inputArray = mutableListOf(1, 2, 1, 2, 1, 2, 1, 2)
        val num = 2
        val output = mutableListOf(1, 1, 1, 1)
        assertEquals(output, extractEachKth(inputArray, num))
    }

    @Test
    fun extractEachKth4() {
        val inputArray = mutableListOf(1, 2, 1, 2, 1, 2, 1, 2)
        val num = 10
        val output = mutableListOf(1, 2, 1, 2, 1, 2, 1, 2)
        assertEquals(output, extractEachKth(inputArray, num))
    }

    @Test
    fun extractEachKth5() {
        val inputArray = mutableListOf(2, 4, 6, 8, 10)
        val num = 2
        val output = mutableListOf(2, 6, 10)
        assertEquals(output, extractEachKth(inputArray, num))
    }
}