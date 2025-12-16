class Solution {
    fun solution(num_list: IntArray): Int {
        var odd: String = ""
        var even: String = ""
        
        for (num in num_list) {
            if (num % 2 == 0) {
                even += num.toString()
            } else {
                odd += num.toString()
            }
        }
        
        return even.toInt() + odd.toInt()
    }
}