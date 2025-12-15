import kotlin.math.max

class Solution {
    fun solution(a: Int, b: Int): Int {
        val ab = (a.toString() + b.toString()).toInt()
        
        return max(ab, 2 * a * b)
    }
}