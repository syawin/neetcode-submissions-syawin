class Solution {
fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val sort = nums.sorted()
    for (i in 0 until sort.lastIndex) {
        if (i > 0 && sort[i] == sort[i - 1]) continue
        val complement = 0 - sort[i]
        var l = i + 1
        var r = sort.lastIndex
        while (l < r) {
            if (l > (i + 1) && sort[l] == sort[l - 1]) l++
            else if (r < sort.lastIndex && sort[r] == sort[r + 1]) r--
            else if (sort[l] + sort[r] == complement) {
                result.add(listOf(sort[i], sort[l], sort[r]))
                l++
            } else if (sort[l] + sort[r] < complement) l++
            else if (sort[l] + sort[r] > complement) r--
        }
    }
    return result
}

}
