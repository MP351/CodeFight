package intro.throughthefog

import java.util.*

fun stringsRearrangement(inputArray: MutableList<String>): Boolean {
    inputArray.sort()
    return treeCheck(inputArray)
}

fun treeCheck(array: MutableList<String>): Boolean {
    array.forEachIndexed { index, it ->
        val root = TreeNode(it, index)

        if (buildTree(root, array))
            return true
    }


    return false
}

fun buildTree(parent: TreeNode, array: MutableList<String>): Boolean {
    val copy = MutableList(array.size) {
        ""
    }
    Collections.copy(copy, array)
    copy.removeAt(parent.index)

    if (copy.isEmpty())
        return true

    copy.forEachIndexed { index, it ->
        var count = 0
        for (i in it.indices) {
            if (parent.value[i] != it[i]) {
                count++
            }
        }
        if (count == 1) {
            val child = TreeNode(it, index)
            if (parent.childs.add(child) && buildTree(child, copy))
                return true
        }
    }
    return false
}

class TreeNode(val value: String, val index: Int) {
    val childs = mutableSetOf<TreeNode>()
}
