package intro.landoflogic

fun digitsProduct(product: Int): Int {
    var y = 0
    if (product in 1..9)
        return product
    if (product == 0)
        return 10

    for (x in 2..9) {
        if (product % x == 0) {
            y = x
        }
    }

    if (y == 0) {
        return -1
    }

    y = "$y${digitsProduct(product/y)}".toCharArray().sorted().joinToString("").toInt()

    if (y < 0)
        return -1
    return y
}
