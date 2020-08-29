package intro.landoflogic

fun differentSquares(matrix: MutableList<MutableList<Int>>): Int {
    val set = mutableSetOf<List<List<Int>>>()
    for (ii in 0 until matrix.size-1) {
        for (jj in 0 until matrix[0].size-1) {
            val newMatrix = mutableListOf<MutableList<Int>>()
            for (i in ii until ii+2) {
                val newList = mutableListOf<Int>()
                for (j in jj until jj+2) {
                    newList.add(matrix[i][j])
                }
                newMatrix.add(newList)
            }
            set.add(newMatrix)
        }
    }
    return set.size
}
