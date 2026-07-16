class Solution {

fun checkInclusion(s1: String, s2: String): Boolean {
    if (s1.length > s2.length) return false
    var l = 0
    val k = s1.length
    var r = k - 1
    val s1FreqMap = buildCharFreqMap(s1)
    val s2FreqMap = buildCharFreqMap(s2.substring(0..r))
    while (r <= s2.lastIndex) {
        if (s1FreqMap == s2FreqMap) {
            return true
        } else {
            s2FreqMap[s2[l]]?.let { s2FreqMap[s2[l]] = it - 1 }
            l++
            r++
            if (r <= s2.lastIndex) {
                s2FreqMap[s2[r]] = (s2FreqMap[s2[r]] ?: 0) + 1
            }
        }
    }
    return false
}

fun buildCharFreqMap(str: String): MutableMap<Char, Int> {
    val map = ('a'..'z').associateWith { 0 }.toMutableMap()
    str.forEach { map[it] = map.getOrDefault(it, 0) + 1 }
    return map
}
}