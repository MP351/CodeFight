package thecore.cornerofzeroesandones

fun mirrorBits(a: Int): Int {
    return Integer.parseInt(Integer.toBinaryString(a).reversed(), 2)
}
