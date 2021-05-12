package thecore.bookmarket

fun isMAC48Address(inputString: String): Boolean {
    return inputString.matches("^(\\d|[a-fA-F]){2}-(\\d|[a-fA-F]){2}-(\\d|[a-fA-F]){2}-(\\d|[a-fA-F]){2}-(\\d|[a-fA-F]){2}-(\\d|[a-fA-F]){2}$".toRegex())
}
