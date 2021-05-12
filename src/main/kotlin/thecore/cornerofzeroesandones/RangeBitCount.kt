package thecore.cornerofzeroesandones

fun rangeBitCount(a: Int, b: Int): Int {
    var sum = 0
    for (i in a..b) {
        sum += Integer.bitCount(i)
    }
    return sum
}
