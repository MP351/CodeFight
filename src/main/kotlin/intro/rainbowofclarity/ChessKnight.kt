package intro.rainbowofclarity

fun chessKnight(cell: String): Int {
    val x = cell[0].toInt() - 97
    val y = cell[1].toInt() - 49

    var counter = 0

    for (i in -2..2) {
        for (j in -2..2) {
            if (kotlin.math.abs(i) + kotlin.math.abs(j) == 3) {
                if (isValidField(x+i, y+j))
                    counter++
            }
        }
    }
    return counter
}

fun isValidField(x: Int, y: Int): Boolean {
    return x in 0..7 && y in 0..7
}