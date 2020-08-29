package intro.exploringthewaters

fun areSimilar(a: MutableList<Int>, b: MutableList<Int>) =
        a.sorted() == b.sorted() && a.zip(b).filter { it.first != it.second }.count() < 3