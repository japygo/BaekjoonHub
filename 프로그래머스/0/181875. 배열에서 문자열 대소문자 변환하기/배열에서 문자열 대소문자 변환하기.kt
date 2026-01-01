class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        return strArr.mapIndexed { index, str ->
            if (index % 2 == 1) {
                str.uppercase()
            } else {
                str.lowercase()
            }
        }.toTypedArray()
    }
}