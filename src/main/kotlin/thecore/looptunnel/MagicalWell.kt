package thecore.looptunnel

fun magicalWell(a: Int, b: Int, n: Int): Int {
    var sum = 0
    var aa = a
    var bb = b
    for (i in 1..n) {
        sum += aa++ * bb++
    }
    return sum
}
