class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val result = mutableMapOf<MutableMap<Char, Int>, MutableList<String>>()
    for (str in strs) {
        val key = mutableMapOf<Char, Int>()
        for (i in str.indices) {
            key[str[i]] = key.getOrDefault(str[i], 0) + 1
        }
        result.getOrPut(key) { mutableListOf() }.add(str)
    }
    return result.values.toList()
}
}
