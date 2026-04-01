class MinStack() {

    val min = ArrayDeque<Int>()
    val stack = ArrayDeque<Int>()

    fun push(`val`: Int) {
        stack.addFirst(`val`)
        if (min.isEmpty() || `val` <= min.first()) {
            min.addFirst(`val`)
        }
    }

    fun pop() {
        if (stack.first() == min.first()) {
            min.removeFirst()
        }
        stack.removeFirst()
    }

    fun top(): Int {
        return stack.first()
    }

    fun getMin(): Int {
        return min.first()
    }
}