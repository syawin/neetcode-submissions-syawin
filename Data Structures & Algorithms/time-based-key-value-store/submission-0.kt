class TimeMap() {

    val names = mutableMapOf<String, MutableList<Pair<Int, String>>>()

    fun set(key: String, value: String, timestamp: Int) {
        names.getOrPut(key, { mutableListOf<Pair<Int, String>>() }).add(timestamp to value)
    }

    fun get(key: String, timestamp: Int): String {
        val queue = names.getOrDefault(key, null)
        if (queue == null || queue[0].first > timestamp) return ""
        var l = 0;
        var r = queue.size - 1
        var res = ""
        while (l <= r) {
            val mid = (l + r) / 2
            val time = queue[mid].first
            when {
                time == timestamp -> {
                    return queue[mid].second
                }

                time < timestamp -> {
                    res = queue[mid].second
                    l = mid + 1
                }

                else              -> {
                    r = mid - 1
                }
            }
        }
        return res
    }
}