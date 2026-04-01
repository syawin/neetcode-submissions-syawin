class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
    for (row in board) { // if any row has a repeated number then return false
        val seen = mutableSetOf<Char>()
        for (ch in row) {
            if (ch == '.') continue
            else if (!seen.add(ch)) return false
        }
    }
    for (i in board[0].indices) {
        val col = arrayOf(
            board[0][i],
            board[1][i],
            board[2][i],
            board[3][i],
            board[4][i],
            board[5][i],
            board[6][i],
            board[7][i],
            board[8][i],
        )
        val seen = mutableSetOf<Char>()
        for (ch in col) {
            if (ch == '.') continue
            else if (!seen.add(ch)) return false
        }
    }
    for (i in 0 until board.size step 3) {
        for (k in 0 until board.size step 3) {
            val seen = mutableSetOf<Char>()
            for (j in k until k + 3) {
                if (board[i][j] != '.' && !seen.add(board[i][j])) return false
                if (board[i + 1][j] != '.' && !seen.add(board[i + 1][j])) return false
                if (board[i + 2][j] != '.' && !seen.add(board[i + 2][j])) return false
            }
        }
    }
    return true
}
}