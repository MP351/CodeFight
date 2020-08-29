package intro.landoflogic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DigitsProductKtTest {

    @Test
    fun digitsProduct1() {
        val input = 12
        val output = 26
        assertEquals(output, digitsProduct(input))
    }

    @Test
    fun digitsProduct2() {
        val input = 19
        val output = -1
        assertEquals(output, digitsProduct(input))
    }

    @Test
    fun digitsProduct3() {
        val input = 450
        val output = 2559
        assertEquals(output, digitsProduct(input))
    }

    @Test
    fun digitsProduct4() {
        val input = 0
        val output =10
        assertEquals(output, digitsProduct(input))
    }
}