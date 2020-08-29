package intro.landoflogic

fun fileNaming(names: MutableList<String>): MutableList<String> {
    val newNames = mutableListOf<String>()

    names.forEach {
        if (!newNames.contains(it)) {
            newNames.add(it)
        } else {
            for (i in 1..1000) {
                if (!newNames.contains("$it($i)")) {
                    newNames.add("$it($i)")
                    break
                }
            }
        }
    }

    return newNames
}
