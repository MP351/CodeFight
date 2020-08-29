package intro.darkwilderness

fun digitDegree(n: Int): Int {
    var deg = 0
    var nn = n.toDouble()
    var sum = 0.0
    if (n < 10)
        return 0

    do {
        sum += nn % 10
        nn /= 10
        nn = nn.toInt().toDouble()
        if (nn.toInt() == 0) {
            deg++
            nn = sum
            sum = 0.0
            if (nn < 10)
                break
        }
    } while(true)

    return deg
}
