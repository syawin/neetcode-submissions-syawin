class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
    val result = MutableList(0) { listOf<Int>() }
    val sort = nums.sorted()
    for (i in 0..sort.lastIndex - 1) {
        for (j in i + 1 until sort.lastIndex) {
            for (k in j + 1..sort.lastIndex) {
                if (sort[i] + sort[j] + sort[k] == 0) {
                    result.add(listOf(sort[i], sort[j], sort[k]))
                }
            }
        }
    }
    return result.distinct()
}
}
