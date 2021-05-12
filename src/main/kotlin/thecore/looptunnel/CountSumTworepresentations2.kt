package thecore.looptunnel


fun countSumOfTwoRepresentations2(n: Int, l: Int, r: Int): Int {
    return kotlin.math.max((kotlin.math.min(n - l, r) - kotlin.math.max(n - r, l)) / 2 + 1, 0)
//    return when {
//
//        r+l > n -> {
//            0
//        }
//        r-l == 0 -> {
//            1
//        }
//        else -> {
//            r - l
//        }
//    }
}
