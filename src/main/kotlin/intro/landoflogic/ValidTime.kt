package intro.landoflogic

fun validTime(time: String): Boolean {
    return time.matches("(([0-1][0-9])|([2][0-3])):([0-5][0-9])".toRegex())
}
