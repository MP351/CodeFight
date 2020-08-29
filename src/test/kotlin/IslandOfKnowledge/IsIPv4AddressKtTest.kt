package IslandOfKnowledge

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IsIPv4AddressKtTest {
    @Test
    fun isIPv4Address1() {
        val input = "172.16.254.1"
        assertTrue(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address2() {
        val input = "172.316.254.1"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address3() {
        val input = ".254.255.0"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address4() {
        val input = "1.1.1.1a"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address5() {
        val input = "1"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address() {
        val input = "0.254.255.0"
        assertTrue(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address7() {
        val input = "1.23.256.255."
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address8() {
        val input = "1.23.256.."
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address9() {
        val input = "0..1.0"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address10() {
        val input = "64.233.161.00"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address11() {
        val input = "64.00.161.131"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address12() {
        val input = "01.233.161.131"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address13() {
        val input = "35..36.9.9.0"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address14() {
        val input = "1.1.1.1.1"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address15() {
        val input = "1.256.1.1"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address16() {
        val input = "a0.1.1.1"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address17() {
        val input = "0.1.1.256"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address18() {
        val input = "129380129831213981.255.255.255"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address19() {
        val input = "255.255.255.255abcdekjhf"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address20() {
        val input = "7283728"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }

    @Test
    fun isIPv4Address21() {
        val input = "0..1.0.0"
        assertFalse(intro.islandofknowledge.isIPv4Address(input))
    }
}