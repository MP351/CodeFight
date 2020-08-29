package intro.throughthefog

fun absoluteValuesSumMinimization(a: MutableList<Int>): Int {
    var min = Integer.MAX_VALUE
    var minI = 0
    a.forEachIndexed { index, it ->
        var v = 0
        for (i in a.indices) {
            v += kotlin.math.abs(a[i] - it)
        }
        if (min > v) {
            min = v
            minI = a[index]
        }
    }
    return minI
}
