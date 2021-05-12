package thecore.looptunnel

fun candles(candlesNumber: Int, makeNew: Int): Int {
    var total = candlesNumber
    var leftovers = candlesNumber

    while (leftovers >= makeNew) {
        val newCandles: Int = leftovers / makeNew
        total += newCandles
        leftovers -= (newCandles * makeNew) - newCandles
    }
    return total
}
