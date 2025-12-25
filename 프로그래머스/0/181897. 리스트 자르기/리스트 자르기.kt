class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        val (a, b, c) = slicer
        return when (n) {
            1 -> num_list.slice(0..b).toIntArray()
            2 -> num_list.slice(a..num_list.size - 1).toIntArray()
            3 -> num_list.slice(a..b).toIntArray()
            4 -> num_list.slice(a..b step c).toIntArray()
            else -> num_list
        }
    }
}