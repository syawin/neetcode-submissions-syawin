class Solution {
fun isPalindrome(s: String): Boolean {
    val palindrome = s.replace(Regex("[^a-zA-Z0-9]"), "").lowercase()
    var l = 0
    var r = palindrome.lastIndex
    while (l < r) {
        if (palindrome[l]!=palindrome[r]) return false
        l++
        r--
    }
    return true
}
}
