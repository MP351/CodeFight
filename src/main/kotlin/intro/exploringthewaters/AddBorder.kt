package intro.exploringthewaters

import intro.thejourneybegins.add

fun addBorder(picture: MutableList<String>): MutableList<String> {
    return picture.map { "*$it*" }.toMutableList().apply {
        val str = "*".repeat(picture[0].length+2)
        add(0, str)
        add(str)
    }
}
