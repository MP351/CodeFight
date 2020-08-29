package intro.smoothsailing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SortByHeightKtTest {

    @Test
    fun sortByHeight1() {
        val input = mutableListOf(-1, 150, 190, 170, -1, -1, 160, 180)
        val output = mutableListOf(-1, 150, 160, 170, -1, -1, 180, 190)
        assertEquals(output, sortByHeight(input))
    }
}