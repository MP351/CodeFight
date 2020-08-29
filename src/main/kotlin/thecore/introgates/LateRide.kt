package thecore.introgates

fun lateRide(n: Int): Int {
    val hours = n / 60
    val minutes = n % 60
    return hours % 10 + hours / 10 + minutes % 10 + minutes / 10
}
