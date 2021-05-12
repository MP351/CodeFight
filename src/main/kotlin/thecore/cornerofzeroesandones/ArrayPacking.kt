package thecore.cornerofzeroesandones

fun arrayPacking(a: MutableList<Int>): Int {
    return a.reversed().reduce { total, it ->
        Integer.parseInt("${getBin(total)}${getBin(it)}", 2)
    }
}

fun getBin(elem: Int): String {
    return String.format("%" + 8 + "s", elem.toString(2)).replace(" ".toRegex(), "0")
}
