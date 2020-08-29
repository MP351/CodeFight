package intro.islandofknowledge

fun avoidObstacles(inputArray: MutableList<Int>): Int {
    var jump = 2
    var i = 0

    while (i < inputArray.size) {
        if (inputArray[i] % jump == 0) {
            jump++
            i = 0
        } else {
            i++
        }
    }
    return jump
}
