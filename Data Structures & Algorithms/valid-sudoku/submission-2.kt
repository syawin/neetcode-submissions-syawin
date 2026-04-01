class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
    val seenRow = Array(9) { HashSet<Char>() }
    val seenCol = Array(9) { HashSet<Char>() }
    val seenSq = Array(9) { HashSet<Char>() }

    for (r in board.indices) {
        for (c in board[r].indices) {
            val cell = board[r][c]
            if (cell == '.') continue
            val addedRow = seenRow[r].add(cell)
            val addedCol = seenCol[c].add(cell)
            val addedSq = seenSq[(r / 3) * 3 + (c / 3)].add(cell)
            if (!addedRow || !addedCol || !addedSq) return false
        }
    }

    return true
}
}
