package intro.landoflogic

fun longestWord(text: String): String {
    return text.split("[^a-zA-Z]".toRegex()).maxBy {
        it.length
    } ?: ""
}
