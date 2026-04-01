class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val result = HashMap<String, MutableList<String>>()
    for (str in strs) {
        val sortedChars = str.toList().sorted().joinToString("")
        val list = result.getOrDefault(sortedChars, mutableListOf())
        list.add(str)
        result[sortedChars] = list
    }
    return result.values.toList()
}
}
