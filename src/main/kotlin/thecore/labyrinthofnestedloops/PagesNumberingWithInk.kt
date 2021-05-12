package thecore.labyrinthofnestedloops

fun pagesNumberingWithInk(current: Int, numberOfDigits: Int): Int {
    var digitsLeft = numberOfDigits
    var nextPage = current
    var nextLength = nextPage.toString().length
    var lastPage = current

    while (digitsLeft >= nextLength) {
        digitsLeft -= nextLength
        lastPage = nextPage
        nextPage++
        nextLength = nextPage.toString().length
    }
    return lastPage
}
