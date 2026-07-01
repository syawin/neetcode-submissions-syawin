class Solution {
fun characterReplacement(s: String, k: Int): Int {
    var l = 0
    var r = 1
    var maxLen = 1
    var mostFreqChar = s[l]
    val charFreq = mutableMapOf<Char, Int>(s[l] to 1)
    while (r < s.length) {
        charFreq[s[r]] = charFreq.getOrDefault(s[r], 0) + 1
        mostFreqChar = charFreq.maxBy { it.value }.key
        val substringLen = r - l + 1
        if (substringLen - charFreq[mostFreqChar]!! <= k) {
            maxLen = max(maxLen, substringLen)
        } else {
            while ((r - l + 1 - charFreq[mostFreqChar]!!) > k) {
                charFreq[s[l]] = charFreq.getOrDefault(s[l], 1) - 1
                mostFreqChar = charFreq.maxBy { it.value }.key
                l++
            }
        }
        r++
    }

    return maxLen
}
}