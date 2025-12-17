class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for (query in queries) {
            arr.swap(query[0], query[1])
        }
        
        return arr
    }
    
    fun IntArray.swap(i: Int, j: Int) {
        val tmp = this[i]
        this[i] = this[j]
        this[j] = tmp
    }
}