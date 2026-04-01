class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    for (i in result.indices) {
        var product = 1
        for (j in nums.indices) {
            if (j==i) continue
            product *= nums[j]
        }
        result[i] = product
    }
    return result
}
}
