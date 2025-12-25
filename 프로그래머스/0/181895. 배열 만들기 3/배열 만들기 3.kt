class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        val (a1, b1) = intervals[0]
        val (a2, b2) = intervals[1]
        return arr.sliceArray(a1..b1) + arr.sliceArray(a2..b2)
    }
}