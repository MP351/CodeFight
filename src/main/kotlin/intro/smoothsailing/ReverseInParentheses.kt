package intro.smoothsailing

import java.util.*

fun reverseInParentheses(inputString: String): String {
    val sb = StringBuilder(inputString)
    val stack = Stack<Int>()
    var size = sb.length-1
    var index = 0

    while (index in 0..size) {
        if ('(' == sb[index]) {
            stack.push(index)
            sb.deleteCharAt(index)
            index--
            size--
        } else if (')' == sb[index]) {
            sb.deleteCharAt(index)
            index--
            size--
            val begin = stack.pop()
            val end = index+1
            sb.replace(begin, end, sb.substring(begin, end).reversed())
        }
        index++
    }

    return sb.toString()
}