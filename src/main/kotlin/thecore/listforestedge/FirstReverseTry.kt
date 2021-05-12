package thecore.listforestedge

fun firstReverseTry(arr: MutableList<Int>): MutableList<Int> {
    if (arr.isEmpty())
        return arr

    val temp = arr.last()
    arr[arr.size-1] = arr.first()
    arr[0] = temp
    return arr
}
