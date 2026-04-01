class Solution {
fun largestRectangleArea(heights: IntArray): Int {
    val stack = ArrayDeque<Int>()
    var maxArea = 0

    for (i in 0..heights.size) {
        val h = if (i < heights.size) heights[i] else 0
        while (stack.isNotEmpty() && h < heights[stack.last()]) {
            val height = heights[stack.removeLast()]
            val width = if (stack.isEmpty()) i else i - stack.last() - 1
            maxArea = maxOf(maxArea, height * width)
        }
        stack.addLast(i)
    }

    return maxArea
}

}
