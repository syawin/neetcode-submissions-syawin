class Solution {
fun dailyTemperatures(temperatures: IntArray): IntArray {
    val result = IntArray(temperatures.size) { 0 }
    if (temperatures.size < 2) return result
    for (i in 0 until temperatures.lastIndex) {
        var dist = 0
        while (dist < temperatures.lastIndex - i) {
            dist++
            if (temperatures[i + dist] > temperatures[i]) {
                result[i] = dist
                break
            }
        }
    }
    println()
    return result
}

}
