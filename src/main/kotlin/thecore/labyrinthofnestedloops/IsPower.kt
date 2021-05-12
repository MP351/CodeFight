package thecore.labyrinthofnestedloops

fun isPower(n: Int): Boolean {
    var i = 2
    var log = 2.0
    if (n == 2)
        return false

    while (log >= 2) {
        log = kotlin.math.log(n.toDouble(), (i++).toDouble())
        if (log.toInt() * 1000 == (log * 1000).toInt())
            return true
    }
    return false
}
