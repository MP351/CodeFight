package thecore.labyrinthofnestedloops

fun squareDigitsSequence(a0: Int): Int {
    var a00 = a0
    val set = mutableSetOf<Int>()
    set.add(a0)

    while (true) {
        var an = 0
        while (a00 != 0) {
            an += Math.pow((a00 % 10).toDouble(), 2.0).toInt()
            a00 /= 10
        }
        if (set.contains(an))
            break
        set.add(an)
        a00 = an

    }

    return set.size+1
}
