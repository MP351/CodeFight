package thecore.cornerofzeroesandones

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import thecore.looptunnel.countSumOfTwoRepresentations2

internal class CountSumTworepresentations2KtTest {

    @Test
    fun countSumOfTwoRepresentations2_1() {
        assertEquals(2, countSumOfTwoRepresentations2(6, 2, 4))
    }

    @Test
    fun countSumOfTwoRepresentations2_2() {
        assertEquals(1, countSumOfTwoRepresentations2(6, 3, 3))
    }

    @Test
    fun countSumOfTwoRepresentations2_3() {
        assertEquals(0, countSumOfTwoRepresentations2(10, 10, 11))
    }

    @Test
    fun countSumOfTwoRepresentations2_4() {
        assertEquals(5, countSumOfTwoRepresentations2(24, 8, 16))
    }

    @Test
    fun countSumOfTwoRepresentations2_5() {
        assertEquals(1, countSumOfTwoRepresentations2(24, 12, 12))
    }

    @Test
    fun countSumOfTwoRepresentations2_6() {
        assertEquals(12, countSumOfTwoRepresentations2(93, 24, 58))
    }
}