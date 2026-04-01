class Solution {
fun dailyTemperatures(temperatures: IntArray): IntArray {
    val result = IntArray(temperatures.size) { 0 }
    if (temperatures.size < 2) return result
    val stack = ArrayDeque<Int>() // stack of indices
    temperatures.forEachIndexed { index, temp ->
        while (stack.isNotEmpty() && temperatures[stack.first()] < temp) {
            // for each index in the stack, inc the same index in the result array
            result[stack.first()] = index - stack.first()
            stack.removeFirst()
        }
        stack.addFirst(index)
    }
    return result
}
}
