class Solution {
fun search(nums: IntArray, target: Int): Int {
    for ((i, num) in nums.withIndex()) {
        if (num == target) {
            return i
        }
    }
    return -1
}

}
