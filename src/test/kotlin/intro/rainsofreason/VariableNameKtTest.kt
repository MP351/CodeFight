package intro.rainsofreason

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class VariableNameKtTest {

    @Test
    fun variableName1() {
        val input = "var_1__Int"
        assertTrue(variableName(input))
    }

    @Test
    fun variableName2() {
        val input = "qq-q"
        assertFalse(variableName(input))
    }

    @Test
    fun variableName3() {
        val input = "2w2"
        assertFalse(variableName(input))
    }

    @Test
    fun variableName4() {
        val input = " variable"
        assertFalse(variableName(input))
    }

    @Test
    fun variableName5() {
        val input = "va[riable0"
        assertFalse(variableName(input))
    }

    @Test
    fun variableName6() {
        val input = "variable0"
        assertTrue(variableName(input))
    }

    @Test
    fun variableName7() {
        val input = "a"
        assertTrue(variableName(input))
    }

    @Test
    fun variableName8() {
        val input = "_Aas_23"
        assertTrue(variableName(input))
    }

    @Test
    fun variableName9() {
        val input = "a a_2"
        assertFalse(variableName(input))
    }

    @Test
    fun variableName10() {
        val input = "0ss"
        assertFalse(variableName(input))
    }
}