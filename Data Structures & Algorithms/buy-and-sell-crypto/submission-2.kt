class Solution {
fun maxProfit(prices: IntArray): Int {
    if (prices.size < 2) return 0
    var maxProfit = 0
    for (i in prices.lastIndex downTo 1) {
        prices[i] = prices[i] - prices[i - 1]
    }
    prices[0] = 0
    var currProfit = 0
    for (i in 0 until prices.size) {
        if (currProfit < 0) currProfit = 0
        currProfit += prices[i]
        maxProfit = max(maxProfit, currProfit)
    }
    return maxProfit
}
}
