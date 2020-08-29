package thecore.introgates

fun phoneCall(min1: Int, min2_10: Int, min11: Int, s: Int): Int {
    var account = s
    var minutes = 1

    while (account > 0) {
        account -= when(minutes) {
            1 -> {
                min1
            }
            in 2..10 -> {
                min2_10
            }
            else -> {
                min11
            }
        }
        minutes++
    }
    if (account < 0)
        minutes--
    return minutes-1
}
