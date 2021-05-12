package thecore.atthecrossroads

fun arithmeticExpression(a: Int, b: Int, c: Int): Boolean {
    return c / b == a || c * b == a || c - b == a || c + b == a
}
