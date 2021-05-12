package thecore.looptunnel

fun increaseNumberRoundness(n: Int): Boolean {
    var nn = n
    var isNum = false

    while (nn > 0) {
        if (nn % 10 > 0)
            isNum = true
        if (isNum && nn % 10 == 0)
            return true
        nn /= 10
    }
    return false
}
