package thecore.bookmarket

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IsMAC48AddressKtTest {

    @Test
    fun isMAC48Address1() {
        val input = "00-1B-63-84-45-E6"
        assertTrue(isMAC48Address(input))
    }

    @Test
    fun isMAC48Address2() {
        val input = "001B-63-84-45-E6"
        assertFalse(isMAC48Address(input))
    }

    @Test
    fun isMAC48Address3() {
        val input = "00-1G-63-84-45-E6"
        assertFalse(isMAC48Address(input))
    }
}