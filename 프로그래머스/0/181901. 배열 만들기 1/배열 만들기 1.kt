class Solution {
    fun solution(n: Int, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (num in 1..n) {
            if (num % k == 0) {
                answer += num
            }
        }
        
        return answer
    }
}