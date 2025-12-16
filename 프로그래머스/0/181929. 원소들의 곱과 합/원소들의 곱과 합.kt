class Solution {
    fun solution(num_list: IntArray): Int {
        var mul: Long = 1L
        var sum: Long = 0L
        
        for (num in num_list) {
            mul *= num
            sum += num
        }
        
        return if (mul < sum * sum) 1 else 0
    }
}