package intro.rainsofreason

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ArrayReplaceKtTest {

    @Test
    fun arrayReplace() {
        val input = mutableListOf(1, 2, 1)
        val elRep = 1
        val subElem = 3
        val output = mutableListOf(3, 2, 3)
        assertEquals(output, intro.rainsofreason.arrayReplace(input, elRep, subElem))
    }
}