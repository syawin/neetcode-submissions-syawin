class Solution {
fun maxArea(heights: IntArray): Int {
    var maxArea = 0
    var l = 0;
    var r = heights.lastIndex;
    while (l < r) {
        val area = (r - l) * minOf(heights[l], heights[r])
        maxArea = maxOf(area, maxArea)
        if (heights[l] > heights[r]) r--
        else l++
    }
    return maxArea
}


}
