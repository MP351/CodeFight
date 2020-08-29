package intro.edgeoftheocean

fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
    var count = 0
    var firstMax = Integer.MIN_VALUE
    var secondMax = Integer.MIN_VALUE

    for (i in 0 until sequence.size) {
        when {
            sequence[i] > firstMax -> {
                secondMax = firstMax
                firstMax = sequence[i]
            }
            sequence[i] > secondMax -> {
                firstMax = sequence[i]
                count++
            }
            else -> {
                count++
            }
        }
    }
    return count < 2
}
