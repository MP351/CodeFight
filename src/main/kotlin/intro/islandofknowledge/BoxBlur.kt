package intro.islandofknowledge

fun boxBlur(image: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    val corruptedImage = mutableListOf<MutableList<Int>>()
    for ((corrI, i) in (0 until image.size-2).withIndex()) {
        corruptedImage.add(mutableListOf())
        for (j in 0 until image[i].size-2) {
            corruptedImage[corrI].add(getAvg(image, i, j))
        }
    }
    return corruptedImage
}

fun getAvg(image: MutableList<MutableList<Int>>, x: Int, y: Int): Int {
    var avg = 0

    for (i in x until x+3) {
        for (j in y until y+3) {
            avg += image[i][j]
        }
    }

    return avg / 9
}