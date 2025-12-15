class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        val answer = when (ineq + eq) {
            ">=" -> n >= m
            "<=" -> n <= m
            ">!" -> n > m
            "<!" -> n < m
            else -> false
        }
        
        return if (answer) 1 else 0
    }
}