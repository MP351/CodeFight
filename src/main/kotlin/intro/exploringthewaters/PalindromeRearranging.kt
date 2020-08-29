package intro.exploringthewaters

fun palindromeRearranging(inputString: String): Boolean {
    val counts = HashMap<Char, Int>()
    inputString.forEach {
        var amount = counts.getOrPut(it) {
            0
        }
        counts[it] = ++amount
    }

    var oddCount = 0
    counts.forEach {
        if (it.value % 2 != 0)
            oddCount++
    }
    return oddCount < 2
}
