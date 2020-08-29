package intro.islandofknowledge

import kotlin.math.abs

fun arrayMaximalAdjacentDifference(inputArray: MutableList<Int>): Int {
    var diff = 0
    for (i in 0..inputArray.size-2) {
        val newDiff = abs(inputArray[i] - inputArray[i+1])
        if (newDiff > diff)
            diff = newDiff
    }

    return diff
}
