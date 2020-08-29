package intro.thejourneybegins

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CenturyFromYearKtTest {

    @Test
    fun centuryFromYear1() {
        val input = 1905
        val output = 20
        assertEquals(output, centuryFromYear(input))
    }

    @Test
    fun centuryFromYear2() {
        val input = 1700
        val output = 17
        assertEquals(output, centuryFromYear(input))
    }

    @Test
    fun centuryFromYear3() {
        val input = 1988
        val output = 20
        assertEquals(output, centuryFromYear(input))
    }
}