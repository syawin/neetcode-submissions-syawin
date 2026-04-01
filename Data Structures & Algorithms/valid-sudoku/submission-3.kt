class Solution {
fun isValidSudoku(board: Array<CharArray>): Boolean {
    val rows = IntArray(9)
    val cols = IntArray(9)
    val squares = IntArray(9)

    for (r in board.indices) {
        for (c in board[r].indices) {
            if (board[r][c] == '.') continue
            val bitPos = board[r][c] - '1'
            val bit = 1 shl bitPos
            val squareIndex = (r / 3) * 3 + (c / 3)

            if ((rows[r] and bit) != 0 || (cols[c] and bit) != 0 || (squares[squareIndex] and bit) != 0) {
                return false
            }

            rows[r] = rows[r] or bit
            cols[c] = cols[c] or bit
            squares[squareIndex] = squares[squareIndex] or bit
        }
    }

    return true
}
}
