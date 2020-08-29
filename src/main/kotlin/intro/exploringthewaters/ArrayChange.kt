package intro.exploringthewaters

fun arrayChange(inputArray: MutableList<Int>): Int {
    var count = 0
    for (i in 0 until inputArray.size-1) {
        if (inputArray[i] >= inputArray[i+1]) {
            count += kotlin.math.abs(inputArray[i+1] - (inputArray[i] + 1))
            inputArray[i+1] = inputArray[i] + 1
        }
    }
    return count
}
