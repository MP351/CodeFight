package thecore.bookmarket

fun htmlEndTagByStartTag(startTag: String): String {
    val end = if (startTag.indexOf(' ') > 0) {
        startTag.indexOf(' ')
    } else {
        startTag.indexOf('>')
    }
    val tag = startTag.substring(1, end)
    return "</$tag>"
}
