class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (num in l..r) {
            if (num.toString().all { it == '0' || it == '5' }) {
                answer += num
            }
        }
        
        return if(answer.isEmpty()) intArrayOf(-1) else answer
    }
}