package intro.landoflogic

fun sumUpNumbers(inputString: String): Int {
    var sum = 0
    inputString.split("\\D+".toRegex()).forEach {
        if (it.isNotEmpty()) {
            sum += it.toInt()
        }
    }

    return sum
}
