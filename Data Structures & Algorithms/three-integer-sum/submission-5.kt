class Solution {
fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    nums.sort()
    for (i in 0 until nums.lastIndex) {
        if (i > 0 && nums[i] == nums[i - 1]) continue
        val complement = 0 - nums[i]
        var l = i + 1
        var r = nums.lastIndex
        while (l < r) {
            if (l > (i + 1) && nums[l] == nums[l - 1]) l++
            else if (r < nums.lastIndex && nums[r] == nums[r + 1]) r--
            else if (nums[l] + nums[r] == complement) {
                result.add(listOf(nums[i], nums[l], nums[r]))
                l++
            } else if (nums[l] + nums[r] < complement) l++
            else if (nums[l] + nums[r] > complement) r--
        }
    }
    return result
}

}
