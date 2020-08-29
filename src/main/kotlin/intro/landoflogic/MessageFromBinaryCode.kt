package intro.landoflogic

fun messageFromBinaryCode(code: String): String {
    var message = ""
    for (i in code.indices step 8) {
        message += Integer.parseInt(code.substring(i..i+7), 2).toChar()
    }
    return message
}
