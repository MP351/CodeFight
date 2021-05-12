package thecore.bookmarket

fun isCaseInsensitivePalindrome(inputString: String): Boolean {
    return inputString.toLowerCase() == inputString.toLowerCase().reversed()
}
