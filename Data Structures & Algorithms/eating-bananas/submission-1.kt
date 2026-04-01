class Solution {
fun minEatingSpeed(piles: IntArray, h: Int): Int {
    val max = piles.max()
    var minK = 1
    while (minK <= max) {
        var totalH = 0L
        for (p in piles) totalH += (p.toLong() + minK - 1) / minK //ceil( p / minK ) using integer div
        if (totalH <= h) return minK
        minK++
    }
    return minK
}

}
