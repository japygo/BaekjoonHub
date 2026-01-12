class Solution {
    fun solution(strArr: Array<String>): Int {
        return strArr.groupBy { it.length }.map { it.value.size }.maxOrNull() ?: 0
    }
}