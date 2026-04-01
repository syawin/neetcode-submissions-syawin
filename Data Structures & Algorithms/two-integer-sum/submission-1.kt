class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    val indexedSort = nums.withIndex().sortedBy { it.value }
    var ptrL = 0
    var ptrR = indexedSort.size - 1
    while (ptrL < ptrR) {
        val sum = indexedSort[ptrL].value + indexedSort[ptrR].value
        when {
            sum > target -> ptrR--
            sum < target -> ptrL++
            else -> {
                val i = indexedSort[ptrL].index
                val j = indexedSort[ptrR].index
                return intArrayOf(minOf(i,j), maxOf(i,j))
            }
        }
    }
    return intArrayOf()
}
}
