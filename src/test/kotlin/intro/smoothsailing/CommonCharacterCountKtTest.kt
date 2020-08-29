package intro.smoothsailing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CommonCharacterCountKtTest {

    @Test
    fun commonCharacterCount1() {
        val input1 = "aabcc"
        val input2 = "adcaa"
        val output = 3
        assertEquals(output, commonCharacterCount(input1, input2))
    }
}