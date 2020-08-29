package intro.thejourneybegins

fun centuryFromYear(year: Int): Int {
    var century = year / 100.0 + 1
    if ((century / century.toInt()) == 1.0)
        century -= 1
    return century.toInt()
}