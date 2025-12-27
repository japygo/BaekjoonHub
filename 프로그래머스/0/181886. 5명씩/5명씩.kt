class Solution {
    fun solution(names: Array<String>): Array<String> {
        return names.filterIndexed { index, _ -> index % 5 == 0 }.toTypedArray()
    }
}