package intro.smoothsailing

fun isLucky(n: Int): Boolean {
    val s1 = n.toString().substring(0, n.toString().length/2)
    val s2 = n.toString().substring(n.toString().length/2, n.toString().length)

    return s1.fold(0) { total, next ->
        total + next.toInt()
    } == s2.fold(0) { total, next ->
        total + next.toInt()
    }
}
