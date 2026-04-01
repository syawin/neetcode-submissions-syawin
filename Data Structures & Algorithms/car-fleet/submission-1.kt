class Solution {
fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
    if (position.size < 2) return position.size
    val sort = position.zip(speed).toMap().toSortedMap(compareByDescending { it })
    val array = sort.map { (pos, spd) -> (target - pos).toDouble() / spd }.toDoubleArray()
    var fleets = 1
    var lead = 0
    for (i in 1..array.lastIndex) {
        if (array[i] > array[lead]) {
            lead = i
            fleets++
        }
    }
    return fleets
}

}