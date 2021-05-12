package thecore.bookmarket

fun isUnstablePair(filename1: String, filename2: String): Boolean {
    return filename1 > filename2 == filename1.toLowerCase() > filename2.toLowerCase()
}
