class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for (query in queries) {
            (query[0]..query[1]).forEach { i ->
                if (i % query[2] == 0) {
                    arr[i] += 1
                }
            }
        }
        
        return arr
    }
}