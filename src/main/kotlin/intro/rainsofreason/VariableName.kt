package intro.rainsofreason

fun variableName(name: String): Boolean {
    return name.matches("([a-zA-Z]|_)\\w*".toRegex())
}
