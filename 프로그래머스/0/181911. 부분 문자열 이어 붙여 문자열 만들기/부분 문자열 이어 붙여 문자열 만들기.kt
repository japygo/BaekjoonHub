class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        return my_strings.mapIndexed { index, string ->
            string.substring(parts[index][0], parts[index][1] + 1)
        }.joinToString("")
    }
}