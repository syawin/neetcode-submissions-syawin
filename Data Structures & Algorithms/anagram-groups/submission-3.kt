class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val result = mutableMapOf<List<Int>, MutableList<String>>()
    for (str in strs) {
        val key = MutableList(26) { 0 }
        for (c in str) {
            key[c - 'a']++
        }
        result.getOrPut(key) { mutableListOf() }.add(str)
    }
    return result.values.toList()
}
}
