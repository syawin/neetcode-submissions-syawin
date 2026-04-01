class Solution {
fun trap(height: IntArray): Int {
    if (height.size <= 2) return 0
    val volumes = IntArray(height.size)
    for (i in 1 until height.lastIndex) {
        val l = height.slice(0..i).max()
        val r = height.slice(i until height.size).max()
        volumes[i] = minOf(l,r) - height[i]
    }
    return volumes.sum()
}
}
