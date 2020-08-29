package intro.landoflogic

fun spiralNumbers(n: Int): MutableList<MutableList<Int>> {
    val matrix = MutableList(n) {
        MutableList(n) {
            0
        }
    }
    var count = 0
    var i = 0
    var j = -1


    var begin = 0
    var end = n

    while (count != n * n) {
        while (j < end-1) {
            matrix[i][++j] = ++count
        }
        while (i < end-1) {
            matrix[++i][j] = ++count
        }
        end -= 1
        while (j > begin) {
            matrix[i][--j] = ++count
        }
        begin += 1
        while (i > begin) {
            matrix[--i][j] = ++count
        }
    }

    return matrix
}
