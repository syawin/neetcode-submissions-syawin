class Solution {
    fun longestConsecutive(nums: IntArray): Int {
    var inc = 1
    var largest = 1
    when (nums.size) {
        0 -> return 0
        1 -> return 1
    }
    val sorted = nums.sorted()
    for (i in 1..sorted.lastIndex) {
        when (sorted[i] - sorted[i - 1]) {
            0 -> continue
            1 -> inc++
            else -> {
                largest = maxOf(largest, inc)
                inc = 1
            }
        }
        largest = maxOf(largest, inc)
    }
    return largest
}
}
