package thecore.labyrinthofnestedloops

fun isSumOfConsecutive2(n: Int): Int {
    var count = 0
    for (i in 1..n) {
        var l = 2
        while ((l-1)*l/2 < n) {
            val test = l * i + (l-1)*l/2
            if (test == n)
                count++
            l++
        }
    }
    return count
}
