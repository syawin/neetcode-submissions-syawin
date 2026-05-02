class Solution {
fun lengthOfLongestSubstring(s: String): Int {
    if (s.length < 2) return s.length
    var maxLength = 1
    var l = 0
    var r = 0
    val hashTable = mutableMapOf<Char, Int>()
    while (r < s.length) {
        val c = s[r]
        hashTable[c] = hashTable.getOrDefault(c, 0) + 1
        while (hashTable[c] ?: 0 > 1 && l < r) {
            val remove: Char = s[l]
            hashTable[remove]?.let { count ->
                if (count > 1) hashTable[remove] = count - 1
                else hashTable.remove(remove)
            }
            l++
        }
        r++
        maxLength = max(hashTable.keys.size, maxLength)
    }
    return maxLength
}

}
