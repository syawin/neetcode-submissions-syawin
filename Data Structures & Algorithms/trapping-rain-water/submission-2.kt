class Solution {
fun trap(height: IntArray): Int {
    if (height.size <= 2) return 0
    var res = 0
    var l = 0
    var r = height.lastIndex
    var leftMax = height[l]
    var rightMax = height[r]
    while (l < r) {
        if (leftMax < rightMax) {
            l++
            leftMax = maxOf(leftMax, height[l])
            res += leftMax - height[l]
        } else {
            r--
            rightMax = maxOf(rightMax, height[r])
            res += rightMax - height[r]
        }
    }
    return res
}
}
