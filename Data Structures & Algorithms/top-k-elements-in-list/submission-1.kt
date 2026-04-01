class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val freq = mutableMapOf<Int, Int>()
    for (num in nums) {
        freq[num] = freq.getOrDefault(num, 0) + 1
    }
    val heap = PriorityQueue<Pair<Int, Int>>(compareBy { it.first } )
    for ((num, freq) in freq) {
        heap.add(Pair(freq, num))
        if (heap.size > k) {
            heap.poll()
        }
    }
    return heap.map { it.second }.toIntArray()
}
}
