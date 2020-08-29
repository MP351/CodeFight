package intro.rainsofreason

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class AlphabeticShiftKtTest {

    @Test
    fun alphabeticShift1() {
        val input = "crazy"
        val output = "dsbaz"
        assertEquals(output, alphabeticShift(input))
    }
}