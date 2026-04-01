class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    val indexMap = nums.withIndex().map { (i, n) -> n to i }.toMap()
    for (i in 0 until nums.size) {
        val compl = target - nums[i]
        if (indexMap[compl] != null && indexMap[compl] != i) {
            return intArrayOf(i, indexMap[compl]!!)
        }
    }
    return intArrayOf()
}
}
