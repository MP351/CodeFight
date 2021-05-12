package thecore.looptunnel

fun leastFactorial(n: Int): Int {
    var fac = 1
    var i = 1
    while (fac < n) {
        fac *= i++
    }
    return fac
}
