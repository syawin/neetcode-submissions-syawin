class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
    var index = 0
    while (index < nums.size - 1) {
        var ptr = index + 1
        while (ptr < nums.size) {
            if (nums[index] == nums[ptr]) return true
            ptr++
        }
        index++
    }
    return false
}
}
