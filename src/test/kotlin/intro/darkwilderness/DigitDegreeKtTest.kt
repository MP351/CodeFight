package intro.darkwilderness

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DigitDegreeKtTest {

    @Test
    fun digitDegree1() {
        val n = 5
        val output = 0
        assertEquals(output, digitDegree(n))
    }

    @Test
    fun digitDegree2() {
        val n = 100
        val output = 1
        assertEquals(output, digitDegree(n))
    }

    @Test
    fun digitDegree3() {
        val n = 91
        val output = 2
        assertEquals(output, digitDegree(n))
    }


}