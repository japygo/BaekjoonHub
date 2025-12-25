class Solution {
    fun solution(arr: IntArray): IntArray {
        val a = arr.indexOfFirst { it == 2 }
        val b = arr.indexOfLast { it == 2 }
        if (a == -1) {
            return intArrayOf(-1)
        }
        return arr.sliceArray(a..b)
    }
}