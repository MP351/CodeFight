package intro.smoothsailing

fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
    inputArray.sortBy {
        it.length
    }
    return inputArray.filter {
        it.length == inputArray[inputArray.size-1].length
    }.toMutableList()
}
