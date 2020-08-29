package intro.darkwilderness

fun longestDigitsPrefix(inputString: String): String {
    if (!"\\d".toRegex().matches(inputString[0].toString()))
        return ""
    return inputString.split("\\D+".toRegex())[0]
}
