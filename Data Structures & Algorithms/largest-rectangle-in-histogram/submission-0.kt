class Solution {
fun largestRectangleArea(heights: IntArray): Int {
    var gMax = 0
    for (i in 0 until heights.size) {
        var lMax = 0
        var minHeight = heights[i]
        for (j in i until heights.size) {
            val w = j - i + 1
            if (heights[j] < minHeight) minHeight = heights[j]
            val area = minHeight * w
            if (area > lMax) lMax = area
        }
        if (lMax > gMax) gMax =  lMax
    }
    return gMax
}

}
