class Solution {
fun search(nums: IntArray, target: Int): Int {
    var lBound = 0
    var rBound = nums.size - 1
    while (true) {
        val mid = (rBound + lBound) / 2
        if (lBound > rBound) {
            return -1
        }
        when {
            target == nums[mid] -> return mid
            target > nums[mid] -> lBound = mid + 1
            else -> rBound = mid - 1
        }
    }
}
}
