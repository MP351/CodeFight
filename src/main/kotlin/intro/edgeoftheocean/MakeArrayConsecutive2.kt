package intro.edgeoftheocean

fun makeArrayConsecutive2(statues: MutableList<Int>) = statues.max()!! - statues.min()!! - statues.size + 1
