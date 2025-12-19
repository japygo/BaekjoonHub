import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val numbers = listOf(a, b, c, d)
        val map = numbers.groupBy { it }.mapValues { it.value.size }
        val list = map.toList().sortedByDescending { it.second }
        
        return when (list.size) {
            1 -> {
                val p = list[0].first
                1111 * p
            }
            2 -> {
                val p = list[0].first
                val q = list[1].first
                
                if (list[0].second == 3) {
                    (10 * p + q) * (10 * p + q)
                } else {
                    (p + q) * abs(p - q)
                }
            }
            3 -> {
                val other = list.filter { it.second != 2 }
                other[0].first * other[1].first
            }
            else -> {
                numbers.minOrNull() ?: 0
            }
        }
    }
}