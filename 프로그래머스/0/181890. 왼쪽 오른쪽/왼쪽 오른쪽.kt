class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        for ((index, str) in str_list.withIndex()) {
            if (str == "l") {
                return str_list.sliceArray(0..index - 1)
            }
            if (str == "r") {
                return str_list.sliceArray(index + 1..str_list.size - 1)
            }
        }
        return arrayOf<String>()
    }
}