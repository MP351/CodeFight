package thecore.bookmarket

fun isTandemRepeat(inputString: String): Boolean {
    if (inputString.length % 2 > 0) {
        return false
    }

    for (i in 0 until inputString.length/2) {
        if (inputString[i] != inputString[inputString.length/2+i]) {
            return false
        }
    }

    return true
}
