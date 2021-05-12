package thecore.atthecrossroads

fun isInfiniteProcess(a: Int, b: Int): Boolean {
    val diff = b - a
    if (a == b)
        return false
    return diff < 2 || diff % 2 != 0
}
