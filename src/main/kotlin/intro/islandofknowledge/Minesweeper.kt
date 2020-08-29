package intro.islandofknowledge

fun minesweeper(matrix: MutableList<MutableList<Boolean>>): MutableList<MutableList<Int>> {
    val field = MutableList(matrix.size+2) {
        MutableList(matrix[0].size+2) {
            false
        }
    }

    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            field[i+1][j+1] = matrix[i][j]
        }
    }

    val result = MutableList(matrix.size) {
        MutableList(matrix[0].size) {
            0
        }
    }

    var resI = 0
    var resJ = 0

    for (i in 1 until field.size-1) {
        resJ = 0
        for (j in 1 until field[0].size-1) {
            if (field[i-1][j-1])
                result[resI][resJ]++
            if (field[i-1][j])
                result[resI][resJ]++
            if (field[i-1][j+1])
                result[resI][resJ]++
            if (field[i][j-1])
                result[resI][resJ]++
            if (field[i][j+1])
                result[resI][resJ]++
            if (field[i+1][j-1])
                result[resI][resJ]++
            if (field[i+1][j])
                result[resI][resJ]++
            if (field[i+1][j+1])
                result[resI][resJ]++
            resJ++
        }
        resI++
    }

    return result
}
