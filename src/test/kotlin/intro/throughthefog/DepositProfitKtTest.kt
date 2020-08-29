package intro.throughthefog

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DepositProfitKtTest {

    @Test
    fun depositProfit1() {
        val deposit = 100
        val rate = 20
        val threshold = 170
        val output = 3
        assertEquals(output, depositProfit(deposit, rate, threshold))
    }

    @Test
    fun depositProfit2() {
        val deposit = 100
        val rate = 1
        val threshold = 101
        val output = 1
        assertEquals(output, depositProfit(deposit, rate, threshold))
    }

    @Test
    fun depositProfit3() {
        val deposit = 1
        val rate = 100
        val threshold = 64
        val output = 6
        assertEquals(output, depositProfit(deposit, rate, threshold))
    }

    @Test
    fun depositProfit4() {
        val deposit = 20
        val rate = 20
        val threshold = 50
        val output = 6
        assertEquals(output, depositProfit(deposit, rate, threshold))
    }

    @Test
    fun depositProfit5() {
        val deposit = 50
        val rate = 25
        val threshold = 100
        val output = 4
        assertEquals(output, depositProfit(deposit, rate, threshold))
    }


}