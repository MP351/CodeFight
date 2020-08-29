package intro.rainsofreason

fun evenDigitsOnly(n: Int): Boolean {
    var num = n
    while (num > 0) {
        if (num % 2 != 0)
            return false
        num /= 10
    }
    return true
}
