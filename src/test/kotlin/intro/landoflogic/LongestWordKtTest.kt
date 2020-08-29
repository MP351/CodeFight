package intro.landoflogic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class LongestWordKtTest {

    @Test
    fun longestWord10() {
        val input = "Ready, ste0ady, go!"
        val output = "Ready"
        assertEquals(output, longestWord(input))
    }
}