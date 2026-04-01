class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    val indexMap = HashMap<Int, Int>()
    for ((i,n) in nums.withIndex()) {
        val compl = target - n
        if (indexMap.containsKey(compl)) {
            return intArrayOf(minOf(i, indexMap[compl]!!),maxOf(i, indexMap[compl]!!))
        }
        indexMap[n] = i
    }
    return intArrayOf()
}
}
