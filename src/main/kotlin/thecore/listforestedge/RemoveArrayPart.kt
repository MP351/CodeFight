package thecore.listforestedge

fun removeArrayPart(inputArray: MutableList<Int>, l: Int, r: Int): MutableList<Int> {
    (r downTo l).forEach {
        inputArray.removeAt(it)
    }
    return inputArray
}
