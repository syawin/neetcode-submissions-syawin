class Solution {
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    var tCopy = t
    for (letter in s) {
        var i = 0
        val currLen = tCopy.length
        while (i < tCopy.length) {
            if (letter == tCopy[i]) {
                tCopy = tCopy.removeRange(i, i + 1)
                break
            }
            i++
        }
        if (i == currLen) return false
    }
    return true
}
}
