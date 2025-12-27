import kotlin.math.max

class Solution {
    fun solution(num_list: IntArray): Int {
        val oddSum = num_list.filterIndexed { index, _ -> index % 2 == 0 }.sum()
        val evenSum = num_list.filterIndexed { index, _ -> index % 2 != 0 }.sum()
        
        return max(oddSum, evenSum)
    }
}