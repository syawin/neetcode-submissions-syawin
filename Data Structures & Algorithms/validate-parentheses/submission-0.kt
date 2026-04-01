class Solution {
fun isValid(s: String): Boolean {
    if (s.length < 2) return false
    val stack = ArrayDeque<Char>()
    for (c in s) {
        when (c) {
            '(', '{', '[' -> stack.addFirst(c)
            ')'           -> {
                if (verifyMatch(stack, '(')) stack.removeFirst() else return false
            }
            '}' -> {
                if (verifyMatch(stack, '{')) stack.removeFirst() else return false
            }
            ']' -> {
                if (verifyMatch(stack, '[')) stack.removeFirst() else return false
            }
        }
    }
    return stack.isEmpty()
}

fun verifyMatch(stack: ArrayDeque<Char>, target: Char): Boolean {
    if (stack.isNotEmpty() && stack.first() == target) return true
    else return false
}
}
