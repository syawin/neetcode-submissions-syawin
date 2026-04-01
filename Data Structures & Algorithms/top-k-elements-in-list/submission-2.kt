class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val freq = mutableMapOf<Int, Int>()
    for (num in nums) {
        freq[num] = freq.getOrDefault(num, 0) + 1
    }

    val buckets = List(nums.size + 1) { mutableListOf<Int>() }
    for ((num, freq) in freq) {
        buckets[freq].add(num)
    }

    val res = mutableListOf<Int>()
    for (i in buckets.size - 1 downTo 0) {
        for (num in buckets[i]) {
            res.add(num)
            if (res.size >= k) {
                return res.toIntArray()
            }
        }
    }
    return res.toIntArray()
}
}
