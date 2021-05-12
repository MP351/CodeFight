package thecore.bookmarket

fun properNounCorrection(noun: String): String {
    val output = "${noun[0].toUpperCase()}${noun.substring(1, noun.length).toLowerCase()}"
    return "${noun[0].toUpperCase()}${noun.substring(1, noun.length).toLowerCase()}"
}
