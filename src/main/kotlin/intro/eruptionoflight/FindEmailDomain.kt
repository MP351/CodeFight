package intro.eruptionoflight

fun findEmailDomain(address: String): String {
    return address.substring(address.indexOfLast {
        it == '@'
    } + 1)
}
