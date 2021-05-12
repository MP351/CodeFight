package thecore.labyrinthofnestedloops

fun comfortableNumbers(l: Int, r: Int): Int {
    var count = 0

    for (a in l until r) {
        val sum = sumOfDigits(a)
        val segmentBegin = a - sum
        val segmentEnd = a + sum

        if (segmentBegin > r || segmentEnd < l)
            continue

        val segmentBeginB = a+1
        val segmentEndB = Math.min(segmentEnd, r)
        for (b in segmentBeginB..segmentEndB) {
            if (isMutuallyComfortable(a, b))
                count++
        }

    }
    return count
}

fun isMutuallyComfortable(a: Int, b: Int): Boolean {
    val sumA = sumOfDigits(a)
    val sumB = sumOfDigits(b)
    val segmentBeginA = a - sumA
    val segmentEndA = a + sumA
    val segmentBeginB = b - sumB
    val segmentEndB = b + sumB

    if (a != b && a in segmentBeginB..segmentEndB && b in segmentBeginA..segmentEndA)
        return true

    return false
}

fun sumOfDigits(digit: Int): Int {
    var sum = 0
    var dig = digit

    while (dig > 0) {
        sum += dig % 10
        dig /= 10
    }

    return sum
}
