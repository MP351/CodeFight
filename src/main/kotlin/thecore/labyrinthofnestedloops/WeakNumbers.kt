package thecore.labyrinthofnestedloops

fun weakNumbers(n: Int): MutableList<Int> {
    val divCounts = MutableList(n) {
        divisorsCount(it+1)
    }

    val weakness = MutableList(n) {
        0
    }

    for (i in weakness.size-1 downTo 0) {
        for (j in i-1 downTo 0) {
            if (divCounts[j] > divCounts[i])
                weakness[i]++
        }
    }

    return mutableListOf(weakness.max() ?: 0, weakness.count {
        it == weakness.max() ?: 0
    })
}

fun divisorsCount(number: Int): Int {
    val divisors = mutableListOf<Int>()

    for (i in 1..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            divisors.add(i)
            if (i * i != number)
                divisors.add(number / i)
        }
    }

    return divisors.size
}
