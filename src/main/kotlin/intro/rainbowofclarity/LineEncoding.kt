package intro.rainbowofclarity

fun lineEncoding(s: String): String {
    var encodedStr = ""

    var counter = 1
    for (i in s.indices) {
        if (i < s.length-1 && s[i] == s[i+1]) {
            counter++
            continue
        }
        when {
            counter > 1 -> {
                encodedStr += "${counter}${s[i]}"
                i.plus(counter - 1)
                counter = 1
            }
            else -> {
                encodedStr += s[i]
                counter = 1
            }
        }
    }

    return encodedStr
}
