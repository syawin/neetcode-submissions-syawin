class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
    val products = IntArray(nums.size) { 1 }
    for (i in 1 until nums.size) { // forward pass
        products[i] = nums[i - 1] * products[i - 1]
    }

    var runningProduct = 1
    for (i in nums.size - 2 downTo 0) { // backwards pass
        runningProduct *= nums[i + 1]
        products[i] *= runningProduct
    }
    return products
}
}
