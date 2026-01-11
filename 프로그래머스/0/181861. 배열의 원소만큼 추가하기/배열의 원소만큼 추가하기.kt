class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (num in arr) {
            repeat(num) {
                answer += num
            }
        }
        
        return answer
    }
}