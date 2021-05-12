package thecore.looptunnel

fun countBlackCells(n: Int, m: Int): Int {
    var count = 0
    val struct = mutableListOf<Double>()
    for (x in 0..m) {
        struct.add(n / m.toDouble() * x)
    }

    if (n == 1 || m == 1)
        return Math.max(n, m)

    for (x in 1 until struct.size) {
        val diff = struct[x] - struct[x-1].toInt()
        when {
            diff < 1 -> {
                count++
            }
            x == struct.size-1 -> {
                count += diff.toInt()
            }
            (diff * 10000).toInt() == diff.toInt() * 10000 -> {
                count += diff.toInt() + 2
            }
            diff > 1 -> {
                count += 2
            }
        }
    }

    return count
}
