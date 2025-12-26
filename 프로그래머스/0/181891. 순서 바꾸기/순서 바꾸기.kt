class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.sliceArray(n..num_list.size - 1) + num_list.sliceArray(0..n - 1)
    }
}