package intro.rainsofreason

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class EvenDigitsOnlyKtTest {

    @Test
    fun evenDigitsOnly1() {
        val input = 248622
        assertTrue(intro.rainsofreason.evenDigitsOnly(input))
    }

    @Test
    fun evenDigitsOnly2() {
        val input = 642386
        assertFalse(intro.rainsofreason.evenDigitsOnly(input))
    }
}