class Solution {
fun trap(height: IntArray): Int {
    if (height.size <= 2) return 0
    val maxima = IntArray(height.size) { 0 }
    var currMax = height[0]
    maxima[0] = height[0]
    for (i in 1 until height.lastIndex) { // forward pass
        currMax = maxOf(currMax, height[i])
        maxima[i] = currMax
    }
    currMax = height.last()
    maxima[maxima.lastIndex] = height.last()
    for (i in height.lastIndex - 1 downTo 1) {
        currMax = maxOf(currMax, height[i])
        maxima[i] = minOf(maxima[i], currMax)
    }
    for(i in maxima.indices) {
        maxima[i] -= height[i]
    }
    return maxima.sum()
}

}
