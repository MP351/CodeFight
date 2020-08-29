package intro.throughthefog

fun depositProfit(deposit: Int, rate: Int, threshold: Int): Int {
    var dep = deposit.toDouble()
    var count = 0
    val ratePercent = rate / 100.0 + 1
    while (dep < threshold) {
        dep *= ratePercent
        count++
    }
    return count
}
