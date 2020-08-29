package intro.edgeoftheocean

fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
    return inputArray.zipWithNext { a, b ->
        a * b
    }.max() ?: 0
}
