package intro.rainsofreason

fun arrayReplace(inputArray: MutableList<Int>, elemToReplace: Int, substitutionElem: Int): MutableList<Int> {
    inputArray.replaceAll {
        if (it == elemToReplace)
            substitutionElem
        else
            it
    }
    return inputArray
}
