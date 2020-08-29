package intro.darkwilderness

fun bishopAndPawn(bishop: String, pawn: String): Boolean {
    val bishopX = bishop[0].toLowerCase().toInt() - 97
    val bishopY = bishop[1].toInt() - 49
    val pawnX = pawn[0].toLowerCase().toInt() - 97
    val pawnY = pawn[1].toInt() - 49

    val p1X = bishopX + 1
    val p1Y = bishopY + 1
    val p2X = bishopX - 1
    val p2Y = bishopY + 1

    val S1 = (bishopX - p1X) * (pawnY - bishopY) - (pawnX - bishopX) * (bishopY - p1Y)
    val S2 = (bishopX - p2X) * (pawnY - bishopY) - (pawnX - bishopX) * (bishopY - p2Y)
    return S1 == 0 || S2 == 0
}
