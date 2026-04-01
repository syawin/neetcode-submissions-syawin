class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size - 1) {
        val arg1 = nums[i]
        for (j in i + 1 until nums.size) {
            if (arg1 + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}
}
