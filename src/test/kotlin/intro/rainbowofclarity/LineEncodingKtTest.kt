package intro.rainbowofclarity

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class LineEncodingKtTest {

    @Test
    fun lineEncoding1() {
        val input = "aabbbc"
        val output = "2a3bc"
        assertEquals(output, lineEncoding(input))
    }
}