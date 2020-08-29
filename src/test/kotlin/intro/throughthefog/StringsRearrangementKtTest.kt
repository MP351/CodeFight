package intro.throughthefog

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class StringsRearrangementKtTest {

    @Test
    fun stringsRearrangement1() {
        val input = mutableListOf("aaa", "bbb", "bab")
        assertFalse(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangement2() {
        val input = mutableListOf("ab", "bb", "aa")
        assertTrue(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangement3() {
        val input = mutableListOf("q", "q")
        assertFalse(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangement4() {
        val input = mutableListOf("zzzzab", "zzzzbb", "zzzzaa")
        assertTrue(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangement5() {
        val input = mutableListOf("ab", "ad", "ef", "eg")
        assertFalse(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangement6() {
        val input = mutableListOf("abc", "bef", "bcc", "bec", "bbc", "bdc")
        assertTrue(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangement7() {
        val input = mutableListOf("abc", "abx", "axx", "abc")
        assertFalse(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangement8() {
        val input = mutableListOf("abc",
                "abx",
                "axx",
                "abx",
                "abc")
        assertTrue(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangement9() {
        val input = mutableListOf("f",
                "g",
                "a",
                "h")
        assertTrue(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangement10() {
        val input = mutableListOf("ff",
                "gf",
                "af",
                "ar",
                "hf")
        assertTrue(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangement11() {
        val input = mutableListOf("a",
                "b",
                "c")
        assertTrue(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangementHidden1() {
        val input = mutableListOf("zzzabzczaba",
                "zzzabzczaaa",
                "zzzabzczabb",
                "zzzabzczbbb")
        assertTrue(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangementHidden2() {
        val input = mutableListOf("abacabaabczzzzz",
                "abacababefzzzzz",
                "abacababcczzzzz",
                "abacababeczzzzz",
                "abacababbczzzzz",
                "abacababdczzzzz")
        assertTrue(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangementHidden3() {
        val input = mutableListOf("abc",
                "xbc",
                "axc",
                "abx")
        assertFalse(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangementHidden18() {
        val input = mutableListOf("abc", "bef", "bcc", "bew", "zew", "zyw", "bec", "bbc", "bdc")
        assertTrue(stringsRearrangement(input))
    }

    @Test
    fun stringsRearrangementHidden21() {
        val input = mutableListOf("abc", "xbc", "axc", "abx")
        assertFalse(stringsRearrangement(input))
    }
}