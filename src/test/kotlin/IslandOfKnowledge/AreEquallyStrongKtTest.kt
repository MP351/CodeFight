package IslandOfKnowledge

import intro.islandofknowledge.areEquallyStrong
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class AreEquallyStrongKtTest {

    @Test
    fun areEquallyStrong1() {
        val yl = 10
        val yr = 15
        val fl = 15
        val fr = 10
        assertTrue(areEquallyStrong(yl, yr, fl, fr))
    }

    @Test
    fun areEquallyStrong2() {
        val yl = 15
        val yr = 10
        val fl = 15
        val fr = 10
        assertTrue(areEquallyStrong(yl, yr, fl, fr))
    }

    @Test
    fun areEquallyStrong3() {
        val yl = 15
        val yr = 10
        val fl = 15
        val fr = 9
        assertFalse(areEquallyStrong(yl, yr, fl, fr))
    }

    @Test
    fun areEquallyStrong4() {
        val yl = 10
        val yr = 5
        val fl = 5
        val fr = 10
        assertTrue(areEquallyStrong(yl, yr, fl, fr))
    }

    @Test
    fun areEquallyStrong5() {
        val yl = 10
        val yr = 15
        val fl = 5
        val fr = 20
        assertFalse(areEquallyStrong(yl, yr, fl, fr))
    }

    @Test
    fun areEquallyStrong6() {
        val yl = 10
        val yr = 20
        val fl = 10
        val fr = 20
        assertTrue(areEquallyStrong(yl, yr, fl, fr))
    }

    @Test
    fun areEquallyStrong7() {
        val yl = 5
        val yr = 20
        val fl = 20
        val fr = 5
        assertTrue(areEquallyStrong(yl, yr, fl, fr))
    }

    @Test
    fun areEquallyStrong8() {
        val yl = 20
        val yr = 15
        val fl = 5
        val fr = 20
        assertFalse(areEquallyStrong(yl, yr, fl, fr))
    }

    @Test
    fun areEquallyStrong9() {
        val yl = 5
        val yr = 10
        val fl = 5
        val fr = 10
        assertTrue(areEquallyStrong(yl, yr, fl, fr))
    }

    @Test
    fun areEquallyStrong10() {
        val yl = 1
        val yr = 10
        val fl = 10
        val fr = 0
        assertFalse(areEquallyStrong(yl, yr, fl, fr))
    }

    @Test
    fun areEquallyStrong11() {
        val yl = 5
        val yr = 5
        val fl = 10
        val fr = 10
        assertFalse(areEquallyStrong(yl, yr, fl, fr))
    }

    @Test
    fun areEquallyStrong12() {
        val yl = 10
        val yr = 5
        val fl = 10
        val fr = 6
        assertFalse(areEquallyStrong(yl, yr, fl, fr))
    }

    @Test
    fun areEquallyStrong13() {
        val yl = 1
        val yr = 1
        val fl = 1
        val fr = 1
        assertTrue(areEquallyStrong(yl, yr, fl, fr))
    }

    @Test
    fun areEquallyStrong14() {
        val yl = 0
        val yr = 10
        val fl = 10
        val fr = 0
        assertTrue(areEquallyStrong(yl, yr, fl, fr))
    }


}