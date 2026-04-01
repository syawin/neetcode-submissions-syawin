class Solution {
fun largestRectangleArea(heights: IntArray): Int {
    val leftBound = IntArray(heights.size) { -1 }
    val rightBound = IntArray(heights.size) { heights.size }
    var maxArea = 0
    val stack = ArrayDeque<Int>()
    for (i in 0 until heights.size) {
        if (stack.isEmpty() || heights[i] >= heights[stack.first()]) {
            stack.addFirst(i)
        } else if (heights[i] < heights[stack.first()]) {
            while (stack.isNotEmpty() && heights[i] < heights[stack.first()]) {
                rightBound[stack.first()] = i
                stack.removeFirst()
            }
            stack.addFirst(i)
        }
    }
    stack.clear()
    for (i in heights.indices.reversed()) {
        if (stack.isEmpty() || heights[i] >= heights[stack.first()]) {
            stack.addFirst(i)
        } else if (heights[i] < heights[stack.first()]) {
            while (stack.isNotEmpty() && heights[i] < heights[stack.first()]) {
                leftBound[stack.first()] = i
                stack.removeFirst()
            }
            stack.addFirst(i)
        }

    }
    for (i in heights.indices) {
        val area = heights[i] * (rightBound[i] - leftBound[i] - 1)
        maxArea = max(maxArea, area)
    }
    return maxArea
}

}