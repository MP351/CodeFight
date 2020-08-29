package intro.eruptionoflight

fun isMAC48Address(inputString: String): Boolean {
    return inputString.matches("^[0-9a-fA-F]{2}-[0-9a-fA-F]{2}-[0-9a-fA-F]{2}-[0-9a-fA-F]{2}-[0-9a-fA-F]{2}-[0-9a-fA-F]{2}$".toRegex())
}
