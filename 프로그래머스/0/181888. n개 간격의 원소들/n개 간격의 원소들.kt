class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.slice(0..num_list.size - 1 step n).toIntArray()
    }
}