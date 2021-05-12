package thecore.looptunnel

fun additionWithoutCarrying(param1: Int, param2: Int): Int {
    var p1 = param1
    var p2 = param2
    var i = 0
    var sum = 0

    while (p1 != 0 && p2 != 0) {
        val part1 = p1 % 10
        val part2 = p2 % 10
        var sum1 = part1 + part2

        if (sum1 > 9)
            sum1 %= 10

        sum += Math.pow(10.0, (i++).toDouble()).toInt() * sum1

        p1 /= 10
        p2 /= 10
    }

    sum += Math.pow(10.0, i.toDouble()).toInt() * Math.max(p1, p2)

    return sum
}
