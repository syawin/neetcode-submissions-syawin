class Solution {
fun search(nums: IntArray, target: Int): Int {
    var l = 0;
    var r = nums.lastIndex
    while (l < r) {
        val mid = (l + r) / 2
        if (nums[mid] == target) return mid
        if (nums[mid] > nums[r]) {
            if (target in nums[l]..nums[mid]) {
                r = mid
            } else {
                l = mid + 1
            }
        } else {
            if (target in nums[mid]..nums[r]) {
                l = mid + 1
            } else {
                r = mid
            }
        }
    }
    return if (nums[l] == target) l else -1
}


}
