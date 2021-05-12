package thecore.atthecrossroads

fun tennisSet(score1: Int, score2: Int): Boolean {
    if (score1 >= 5 && score2 >= 5) {
        if ((score1 == 7 || score2 == 7) && (score1 <= 7 && score2 <= 7))
            return score1 != score2
    } else if (score1 < 7 && score2 < 7) {
        if (score1 == 6 || score2 == 6)
            return true
    }
    return false
}
