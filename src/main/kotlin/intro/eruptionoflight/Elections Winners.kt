package intro.eruptionoflight

fun electionsWinners(votes: MutableList<Int>, k: Int): Int {
    var count = 0
    val max = votes.max() ?: 0

    votes.forEach {
        if (it+k > max)
            count++
    }

    if (count == 0 && votes.count {
                it == max
            } == 1)
        count++
    return count
}
