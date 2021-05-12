package thecore.looptunnel

fun lineUp(commands: String): Int {
    var isSameDirection = true
    var count = 0

    if (commands.isNotEmpty() && commands[0] == 'A')
        count++
    else
        isSameDirection = false

    for (i in 0 until commands.length-1) {
        when {
            !isSameDirection && commands[i+1] != 'A' -> {
                isSameDirection = true
                count++
            }
            isSameDirection && commands[i+1] == 'A' -> {
                count++
            }
            else -> {
                isSameDirection = false
            }
        }
    }
    return count
}
