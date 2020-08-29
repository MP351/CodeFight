package intro.throughthefog

fun circleOfNumbers(n: Int, firstNumber: Int)
        = when(val ans = n / 2 + firstNumber) {
    !in 0 until n -> {
         ans - n
    }
    else -> {
        ans
    }
}
