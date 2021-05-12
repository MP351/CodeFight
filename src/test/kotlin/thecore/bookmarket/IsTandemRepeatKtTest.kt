package thecore.bookmarket

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IsTandemRepeatKtTest {

    @Test
    fun isTandemRepeat1() {
        val input = "tandemtandem"
        assertTrue(isTandemRepeat(input))
    }
}