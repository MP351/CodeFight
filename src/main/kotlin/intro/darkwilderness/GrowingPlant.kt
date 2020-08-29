package intro.darkwilderness

import kotlin.math.roundToInt

fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {
    if (desiredHeight <= upSpeed)
        return 1

    val res: Double = (desiredHeight - downSpeed) / (upSpeed - downSpeed.toDouble())
    return res.roundToInt()
}
