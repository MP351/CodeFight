package intro.landoflogic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MessageFromBinaryCodeKtTest {

    @Test
    fun messageFromBinaryCode1() {
        val input = "010010000110010101101100011011000110111100100001"
        val output = "Hello!"
        assertEquals(output, messageFromBinaryCode(input))
    }
}