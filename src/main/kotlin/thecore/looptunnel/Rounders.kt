package thecore.looptunnel

fun rounders(n: Int): Int {
    var i = 0
    var nn = n
    var rounded = 0

    while (nn > 9) {
        val end = nn % 10
        nn /= 10
        if (end in 5..9)
            nn++

        i++
    }
    rounded += Math.pow(10.0, (i).toDouble()).toInt() * nn
    return rounded
}
