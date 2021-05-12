package thecore.labyrinthofnestedloops


fun rectangleRotation(a: Int, b: Int): Int {
    val aHalfBisect = a / Math.sqrt(2.0) / 2
    val bHalfBisect = b / Math.sqrt(2.0) / 2
    val rect1 = mutableListOf(Math.floor(aHalfBisect) * 2 + 1, Math.floor(bHalfBisect) * 2 + 1)
    val rect2 = mutableListOf<Double>()

    if (aHalfBisect - Math.floor(aHalfBisect) < 0.5)
        rect2.add(rect1[0] - 1)
    else
        rect2.add(rect1[0] + 1)

    if (bHalfBisect - Math.floor(bHalfBisect) < 0.5)
        rect2.add(rect1[1] - 1)
    else
        rect2.add(rect1[1] - 1)

    println(rect1)
    println(rect2)
    return rect1.reduce { acc, d ->
        acc * d
    }.toInt() + rect2.reduce { acc, d ->
        acc * d
    }.toInt()
}
