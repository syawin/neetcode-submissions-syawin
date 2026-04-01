class Solution {
fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    for (row in matrix) {
        for (col in row) {
            if (col == target) return true
        }
    }
    return false
}
}
