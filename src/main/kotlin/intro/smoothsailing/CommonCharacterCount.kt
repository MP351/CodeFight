package intro.smoothsailing

fun commonCharacterCount(s1: String, s2: String): Int {
    var count = 0
    val sb = StringBuilder(s2)
    s1.toCharArray().forEach {
        if (sb.contains(it)) {
            count++
            val index = sb.indexOf(it)
            sb.deleteCharAt(index)
        }
    }
    return count
}
