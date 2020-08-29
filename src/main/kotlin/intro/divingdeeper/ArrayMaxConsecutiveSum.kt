package intro.divingdeeper

fun arrayMaxConsecutiveSum(inputArray: MutableList<Int>, k: Int): Int {
    var max = 0
    for (i in 0 until k) {
        max += inputArray[i]
    }
    var buff = max
    for (i in 1..inputArray.size - k) {
        val next = buff - inputArray[i-1] + inputArray[i+k-1]
        if (max < next)
            max = next
        buff = next
    }
    return max
}
