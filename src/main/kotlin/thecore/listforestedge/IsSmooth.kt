package thecore.listforestedge

fun isSmooth(arr: MutableList<Int>): Boolean {
    val middle = if (arr.size % 2 == 0) {
        arr[arr.size/2] + arr[arr.size/2 - 1]
    } else {
        print(Math.round(arr.size/2.0).toInt())
        arr[Math.round(arr.size/2.0).toInt()]
    }

    return arr.first() == arr.last() && arr.first() == middle
}
