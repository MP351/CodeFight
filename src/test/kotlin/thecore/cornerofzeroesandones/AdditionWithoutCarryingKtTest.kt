package thecore.cornerofzeroesandones

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import thecore.looptunnel.additionWithoutCarrying

internal class AdditionWithoutCarryingKtTest {

    @Test
    fun additionWithoutCarrying1() {
        val input1 = 456
        val input2 = 1734

        assertEquals(1180, additionWithoutCarrying(input1, input2))
    }
}