class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val freq = mutableMapOf<Int, Int>()
    for (num in nums) {
        freq[num] = freq.getOrDefault(num, 0) + 1
    }
    return freq.entries.sortedByDescending { it.value }.take(k).map { it.key }.toIntArray()
}
}
