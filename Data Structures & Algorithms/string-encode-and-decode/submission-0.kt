@OptIn(kotlin.ExperimentalStdlibApi::class)
class Solution {

    val PREFIX_WINDOW_LENGTH = 8
val HEX_FORMAT = HexFormat {
    upperCase = true
    number {
        removeLeadingZeros = true
        minLength = PREFIX_WINDOW_LENGTH
    }
}


fun encode(strs: List<String>): String {
    val encoded = StringBuilder()
    for (str in strs) {
        val strLenInHex = str.length.toHexString(HEX_FORMAT)
        encoded.append(strLenInHex + str)
    }
    return encoded.toString()
}


fun decode(str: String): List<String> {
    val decoded = mutableListOf<String>()
    var ptr = 0
    while (ptr < str.length) {
        val fixedLenWindow = str.slice(ptr until ptr + PREFIX_WINDOW_LENGTH)
        val length: Int = fixedLenWindow.hexToInt(HEX_FORMAT)
        ptr += PREFIX_WINDOW_LENGTH
        val word = str.slice(ptr until ptr + length)
        ptr += length
        decoded.add(word)
    }
    return decoded
}
}
