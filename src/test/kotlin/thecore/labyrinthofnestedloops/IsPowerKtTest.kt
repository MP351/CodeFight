package thecore.labyrinthofnestedloops

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IsPowerKtTest {

    @Test
    fun isPower1() {
        val n = 125
        assertTrue(isPower(n))
    }

    @Test
    fun isPower2() {
        val n = 72
        assertFalse(isPower(n))
    }

    @Test
    fun isPower_my1() {
        val n = 1
        assertFalse(isPower(n))
    }

    @Test
    fun isPower_my2() {
        val n = 400
        assertTrue(isPower(n))
    }

    @Test
    fun isPower_hidden11() {
        val n = 122
        assertFalse(isPower(n))
    }

    @Test
    fun isPower_hidden12() {
        val n = 290
        assertFalse(isPower(n))
    }

    @Test
    fun isPower_hidden13() {
        val n = 1
        assertTrue(isPower(n))
    }

    @Test
    fun isPower_hidden14() {
        val n = 2
        assertFalse(isPower(n))
    }

    @Test
    fun isPower_hidden15() {
        val n = 343
        assertTrue(isPower(n))
    }

    @Test
    fun isPower_hidden16() {
        val n = 144
        assertTrue(isPower(n))
    }

    @Test
    fun isPower_hidden17() {
        val n = 289
        assertTrue(isPower(n))
    }

    @Test
    fun isPower_hidden18() {
        val n = 255
        assertTrue(isPower(n))
    }

    @Test
    fun isPower_hidden19() {
        val n = 35
        assertFalse(isPower(n))
    }

    @Test
    fun isPower_hidden1() {
        val n = 3
        assertFalse(isPower(n))
    }
}