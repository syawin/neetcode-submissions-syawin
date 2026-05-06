class Solution {
fun characterReplacement(s: String, k: Int): Int {
    var maxLen = 0
    for (i in 0 until s.lastIndex) {
        val charFreq = mutableMapOf<Char, Int>()
        charFreq[s[i]] = charFreq.getOrDefault(s[i], 0) + 1
        for (j in i + 1 until s.length) {
            charFreq[s[j]] = charFreq.getOrDefault(s[j], 0) + 1
            val subStringLen = j - i + 1
            val numReplacements: Int = subStringLen - charFreq.values.max()
            if (numReplacements <= k) maxLen =  max(maxLen, subStringLen)
        }
    }
    return maxLen
}

}
