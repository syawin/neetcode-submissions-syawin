class Solution {
fun evalRPN(tokens: Array<String>): Int {
    val operands = ArrayDeque<Int>()
    val operators = hashMapOf<String, (Int, Int) -> Int>(
        "+" to { a, b -> a + b },
        "-" to { a, b -> a - b },
        "*" to { a, b -> a * b },
        "/" to { a, b -> a / b },
    )
    for (t in tokens) {
        if (t in operators) {
            val b = operands.removeFirst()
            val a = operands.removeFirst()
            val res = operators.getValue(t)(a, b)
            operands.addFirst(res)
        } else operands.addFirst(t.toInt())
    }
    return operands.first()
}

}
