package thecore.introgates

fun seatsInTheater(nCols: Int, nRows: Int, col: Int, row: Int): Int {
    return (nCols - col + 1) * (nRows - row)
}
