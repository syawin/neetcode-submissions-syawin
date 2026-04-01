class Solution {
fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val n = nums1.size;
    val m = nums2.size
    var nPtr = 0;
    var mPtr = 0
    val midIndex = (n + m) / 2
    var median = 0;
    var prevMedian = 0
    while ((nPtr + mPtr) <= midIndex) {
        if (nums1.getOrElse(nPtr) { Integer.MAX_VALUE } < nums2.getOrElse(mPtr) { Integer.MAX_VALUE }) {
            prevMedian = median
            median = nums1[nPtr]
            nPtr++
        } else {
            prevMedian = median
            median = nums2[mPtr]
            mPtr++
        }
    }
    println("median: $median, prevMedian: $prevMedian")
    if ((n + m) % 2 == 1) {
        return median.toDouble()
    } else {
        return (median.toDouble() + prevMedian) / 2
    }
}

}
