class Solution {
    fun isAnagram(s: String, t: String): Boolean {
            return (s.length == t.length)
            && (s.toCharArray().sorted() == t.toCharArray().sorted())
    }
}
