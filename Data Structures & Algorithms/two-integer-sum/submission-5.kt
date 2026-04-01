class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    val indexMap = nums.withIndex().map { (i, n) -> n to i }.toMap()
    for ((i, n) in nums.withIndex()) {
        val complement = target - n
        if (indexMap.containsKey(complement) && indexMap[complement] != i) {
            val j = indexMap[complement]!!
            return intArrayOf(minOf(i, j), maxOf(i, j))
        }
    }
    return intArrayOf()
}
}
