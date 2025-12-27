class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for (query in queries) {
            (query[0]..query[1]).forEach {
                arr[it] += 1
            }
        }
        return arr
    }
}