class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (query in queries) {
            answer += arr.slice((query[0]..query[1])).filter { it > query[2] }.minOrNull() ?: -1
        }
        
        return answer
    }
}