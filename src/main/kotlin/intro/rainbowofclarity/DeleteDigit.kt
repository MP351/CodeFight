package intro.rainbowofclarity

fun deleteDigit(n: Int): Int {
    val str = StringBuilder(n.toString())

    for (i in str.indices) {
        if (i == str.length-1 || str[i] < str[i+1]) {
            str.deleteCharAt(i)
            break
        }
    }

    return str.toString().toInt()
}
