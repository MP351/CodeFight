package thecore.looptunnel

fun appleBoxes(k: Int): Int {
    var yellow = 0
    var red = 0
    (1..k).forEach {
        if (it % 2 == 0) {
            red += it * it
        } else
            yellow += it * it
    }
    return red - yellow
}
