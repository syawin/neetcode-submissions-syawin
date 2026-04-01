class Solution {
fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    var lBound = 0
    var rBound = matrix.size - 1
    var searchRow: Int = 0
    while (lBound <= rBound) {
        searchRow = (lBound + rBound) / 2
        if (target == matrix[searchRow][0]) return true
        else if (target > matrix[searchRow][0]) lBound = searchRow + 1
        else rBound = searchRow - 1
    }
    searchRow = maxOf(rBound, 0)
    var searchCol = 0
    lBound = 0
    rBound = matrix[searchRow].size - 1
    while (lBound <= rBound) {
        searchCol = (lBound + rBound) / 2
        if (target == matrix[searchRow][searchCol]) return true
        else if (target > matrix[searchRow][searchCol]) lBound = searchCol + 1
        else rBound = searchCol - 1
    }
    return false

}

}
