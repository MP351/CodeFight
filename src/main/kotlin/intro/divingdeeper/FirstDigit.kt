package intro.divingdeeper

fun firstDigit(inputString: String): Char {
    return inputString.first {
        it in '0'..'9'
    }
}
