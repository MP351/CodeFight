package intro.exploringthewaters

fun alternatingSums(a: MutableList<Int>): MutableList<Int> {
    return mutableListOf(
            a.foldIndexed(0) { index, total, it->
                if (index % 2 == 0)
                    total + it
                else
                    total
            },
            a.foldIndexed(0) { index, total, it ->
                if (index % 2 != 0)
                    total + it
                else
                    total
            }
    )
}
