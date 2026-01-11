class Solution {
    fun solution(myStr: String): Array<String> {
        val result = myStr.split("[abc]".toRegex()).filter { it.isNotEmpty() }
        return if (result.isEmpty()) arrayOf("EMPTY") else result.toTypedArray()
    }
}