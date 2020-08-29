package intro.eruptionoflight

fun buildPalindrome(st: String): String {
    if(isPalindrome(st))
        return st

    val ts = st.reversed()

    for (i in st.indices) {
        val str = st + ts.substring(ts.length-i-1)
        if (isPalindrome(str))
            return str
    }

    return ""
}

fun isPalindrome(st: String): Boolean {
    for (i in 0..st.length/2) {
        if (st[i] != st[st.length-i-1])
            return false
    }
    return true
}
