package intro.darkwilderness

fun knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    return if (weight1 + weight2 <= maxW)
        value1 + value2
    else if (value1 > value2 && weight1 <= maxW)
        value1
    else if (weight2 <= maxW)
        value2
    else if (weight1 <= maxW)
        value1
    else
        0
}
