class Solution {
fun longestConsecutive(nums: IntArray): Int {
    if (nums.size==0) return 0
    var longest = 1
    val uniques = nums.toHashSet()
    for (i in 0..nums.lastIndex) {
        if (!uniques.contains(nums[i] - 1)) { //if this is true we've found a start of sequence
            var len = 1
            var nextSeq = nums[i] + 1
            while (uniques.contains(nextSeq)) {
                len++
                nextSeq++
            }
            if (len > longest) longest = len
        }
    }
    return longest
}
}
