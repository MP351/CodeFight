package intro.eruptionoflight

fun isBeautifulString(inputString: String): Boolean {
    val struct = MutableList(26) {
        0
    }

    inputString.toCharArray().forEach {
        struct[it.toInt() - 97] += 1
    }

    var prevCount = Integer.MAX_VALUE

    for (i in struct.indices) {
        if (prevCount >= struct[i]) {
            prevCount = struct[i]
        } else {
            return false
        }
    }

    return true
}
