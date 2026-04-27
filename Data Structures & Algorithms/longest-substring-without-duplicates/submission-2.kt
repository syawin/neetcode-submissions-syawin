class Solution {
fun lengthOfLongestSubstring(s: String): Int {
    if (s.length < 2) return s.length
    var maxLength = 0
    for (i in s.indices) {
        var curStr = "${s[i]}"
        for (j in i + 1 until s.length) {
            if (s[j] in curStr) {
                maxLength = max(maxLength, curStr.length)
                break
            }
            curStr += s[j]
            maxLength = max(maxLength, curStr.length)
        }
    }
    return maxLength
}
}
