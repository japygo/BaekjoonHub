class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 1
        
        if (num_list.size > 10) {
            answer = num_list.sum()
        } else {
            for (num in num_list) {
                answer *= num
            }
        }
        
        return answer
    }
}