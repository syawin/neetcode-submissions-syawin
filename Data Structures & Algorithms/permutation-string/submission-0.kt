class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
    val freqMapS1 = buildCharFreqMap(s1)
    for (i in 0 until s2.length - s1.length + 1) {
        val freqMapS2 = buildCharFreqMap(s2.substring(i, i + s1.length))
        if (freqMapS1 == freqMapS2) {
            return true
        }
    }
    return false
}

fun buildCharFreqMap(str: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    for (ch in str.toCharArray()) {
        map[ch] = map.getOrDefault(ch, 0) + 1
    }
    return map
}
}
