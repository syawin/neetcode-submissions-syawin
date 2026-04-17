class Solution {
fun maxProfit(prices: IntArray): Int {
    var profit = 0
    for (i in 0 until prices.lastIndex) {
        val buy = prices[i]
        for (j in i+1 until prices.size) {
            val sell = prices[j]
            profit = max(profit, sell - buy)
        }
    }
    return if (profit <= 0) 0 else profit
}
}