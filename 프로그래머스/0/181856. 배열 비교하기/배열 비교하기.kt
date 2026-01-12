class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        val size = arr1.size.compareTo(arr2.size)
        if (size != 0) return size
        return arr1.sum().compareTo(arr2.sum())
    }
}