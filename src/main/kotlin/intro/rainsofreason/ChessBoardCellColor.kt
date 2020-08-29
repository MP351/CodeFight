package intro.rainsofreason

fun chessBoardCellColor(cell1: String, cell2: String): Boolean {
    return isDark(cell1) == isDark(cell2)
}

fun isDark(cell: String): Boolean {
    return if (cell[0].toInt() % 2 != 0) {
        cell[1].toInt() % 2 != 0
    } else {
        cell[1].toInt() % 2 == 0
    }
}
