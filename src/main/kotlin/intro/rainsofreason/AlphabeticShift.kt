package intro.rainsofreason

fun alphabeticShift(inputString: String): String {
    return StringBuilder(inputString).map {
        when(it) {
            'z' -> {
                'a'
            }
            'Z' -> {
                'A'
            }
            else -> {
                it+1
            }
        }
    }.joinToString("")
}
