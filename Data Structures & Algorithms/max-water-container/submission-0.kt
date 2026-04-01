class Solution {
fun maxArea(heights: IntArray): Int {
    var maxArea = 0
    for (i in 0 until heights.lastIndex) {
        for (j in i + 1 until heights.size) {
            val area = (j - i) * minOf(heights[i], heights[j])
            maxArea = maxOf(area, maxArea)
        }
    }
    return maxArea
}
}
