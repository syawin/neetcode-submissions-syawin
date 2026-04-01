class Solution {
fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val small = if (nums1.size <= nums2.size) nums1 else nums2
    val large = if (small === nums1) nums2 else nums1
    val n = small.size
    val m = large.size
    val half = (n + m) / 2
    var left = 0
    var right = n

    while (left <= right) {
        val pivot = (left + right) / 2
        val j = half - pivot
        
        val smallLeft = if (pivot > 0) small[pivot - 1] else Integer.MIN_VALUE
        val smallRight = if (pivot < n) small[pivot] else Integer.MAX_VALUE
        val largeLeft = if (j > 0) large[j - 1] else Integer.MIN_VALUE
        val largeRight = if (j < m) large[j] else Integer.MAX_VALUE

        if (largeLeft > smallRight) {
            left = pivot + 1
        } else if (smallLeft > largeRight) {
            right = pivot - 1
        } else {
            val rightMin = min(smallRight, largeRight)
            if ((n + m) % 2 != 0) return rightMin.toDouble()
            
            val leftMax = max(smallLeft, largeLeft)
            return (leftMax.toDouble() + rightMin) / 2
        }
    }
    return 0.0
}
}