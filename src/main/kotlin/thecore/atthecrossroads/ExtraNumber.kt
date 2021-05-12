package thecore.atthecrossroads

fun extraNumber(a: Int, b: Int, c: Int): Int {
    return when (a) {
        b -> c
        c -> b
        else -> a
    }
}
