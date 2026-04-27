class Solution {
    fun maxProfit(prices: IntArray): Int {
    var minBuy = prices.first()
    var maxProfit = 0
    for (sell in prices) {
        maxProfit = max(maxProfit, sell - minBuy)
        minBuy = minOf(minBuy, sell)
    }
    return maxProfit
}
}
