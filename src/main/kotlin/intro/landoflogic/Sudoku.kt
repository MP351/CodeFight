package intro.landoflogic

fun sudoku(grid: MutableList<MutableList<Int>>): Boolean {
    val fieldSize = 9
    for (i in 0 until 9) {
        if (grid[i].distinct().size != fieldSize)
            return false
    }

    for (i in 0 until grid.size) {
        val set = mutableSetOf<Int>()
        for (j in 0 until grid[i].size) {
            if (set.contains(grid[j][i]))
                return false
            set.add(grid[j][i])
        }
    }
    for (ii in 0 until grid.size step 3) {
        for (jj in 0 until grid[ii].size step 3) {
            val set = mutableSetOf<Int>()
            for (i in ii until ii+3) {
                for (j in jj until jj+3) {
                    if (set.contains(grid[i][j]))
                        return false
                    set.add(grid[i][j])
                }
            }
        }
    }
    return true
}
