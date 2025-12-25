class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var start = 0
        var end = arr.size - 1
        
        for ((i, q) in query.withIndex()) {
            if (i % 2 == 0) {
                end = start + q
            } else {
                start = start + q
            }
        }
        
        return arr.sliceArray(start..end)
    }
}