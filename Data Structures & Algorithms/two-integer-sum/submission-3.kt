class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    val indexMap = nums.withIndex().map {  it.value to it.index }.toMap()
    for ((index, value) in nums.withIndex()) {
        val complement = target - value
        if (nums.contains(complement) && indexMap[complement] != index) {
            val i = index
            val j = indexMap[complement]!!
            return intArrayOf(minOf(i, j), maxOf(i, j))
        }
    }
    return intArrayOf()
}
}
