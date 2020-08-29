package intro.islandofknowledge

import java.lang.Exception

fun isIPv4Address(inputString: String): Boolean {
    val octets = inputString.split(".")
    if (octets.size != 4)
        return false

    try {
        octets.forEach {
            if (it[0] == '0' && it.length > 1)
                return false
            val octet = Integer.parseInt(it)
            if (octet < 0 || octet > 255)
                return false
        }
    } catch (e: Exception) {
        return false
    }
    return true
}
