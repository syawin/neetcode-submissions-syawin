class Solution {
fun twoSum(numbers: IntArray, target: Int): IntArray {
    var l = 0
    var r = numbers.lastIndex
    while (l < r) {
        if (numbers[l] + numbers[r] == target) break
        else if (numbers[l] + numbers[r] < target) l++
        else if (numbers[l] + numbers[r] > target) r--
    }
    return intArrayOf(l+1, r+1)
}
}
