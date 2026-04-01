class Solution {
fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val sorted = (nums1 + nums2).sorted()
    if (sorted.size % 2 == 1) {
        return sorted[sorted.size / 2].toDouble()
    } else {
        return (sorted[sorted.size / 2] + sorted[sorted.size / 2 - 1]).toDouble() / 2
    }
}

}
