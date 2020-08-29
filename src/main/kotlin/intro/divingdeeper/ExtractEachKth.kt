package intro.divingdeeper

fun extractEachKth(inputArray: MutableList<Int>, k: Int): MutableList<Int> {
    for (i in inputArray.size-1 downTo 0) {
        if ((i+1) % k == 0) {
            inputArray.removeAt(i)
        }
    }
    return inputArray
}
