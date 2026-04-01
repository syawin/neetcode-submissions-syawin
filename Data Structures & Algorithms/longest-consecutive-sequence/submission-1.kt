class Solution {
fun longestConsecutive(nums: IntArray): Int {
    when (nums.size) {
        0 -> return 0
        1 -> return 1
    }
    val vertices = nums.toHashSet()
    val adjList = Array(vertices.size) { mutableListOf<Int>() } // build adjacency list
    for (i in vertices.indices) {
        var next = vertices.elementAt(i) + 1
        while (vertices.contains(next)) {
            adjList[i].add(next)
            next++
        }
    }
    return (adjList.maxOfOrNull { it.size } ?: 0) + 1
}
}
