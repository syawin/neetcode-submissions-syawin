class Solution {
fun minEatingSpeed(piles: IntArray, h: Int): Int {
    var minK = piles.max()
    var l = 1; var r = minK
    while (true) {
        val mid = (l + r) / 2
        if (l > r) return minK
        if (calcHours(piles, mid) > h.toLong()) {
            l = mid + 1
        } else {
            minK = mid
            r = mid - 1
        }
    }
}



    fun calcHours(piles: IntArray, minK: Int): Long {
    var totalH = 0L
    for (p in piles) {
        totalH += (p.toLong() + minK - 1) / minK
    }
    return totalH
}
}
