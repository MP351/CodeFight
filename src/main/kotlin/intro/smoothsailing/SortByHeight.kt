package intro.smoothsailing

fun sortByHeight(a: MutableList<Int>): MutableList<Int> {
    val b = a.filter {
        it != -1
    }.sorted()
    var index = 0

    print(b)
    return a.map {
        if (it != -1)
            b[index++]
        else
            -1
    }.toMutableList()
}
