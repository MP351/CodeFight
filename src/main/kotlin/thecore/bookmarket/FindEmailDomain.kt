package thecore.bookmarket

import intro.thejourneybegins.add

fun findEmailDomain(address: String): String {
    return address.substring(address.lastIndexOf('@')+1 until address.length)
}
