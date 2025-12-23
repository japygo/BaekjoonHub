class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = IntArray(52)
        
        val map = my_string.chunked(1).groupBy { it }.mapValues { it.value.size }
        
        ('A'..'Z').forEachIndexed { index, c ->
            answer[index] = map[c.toString()] ?: 0
        }


        ('a'..'z').forEachIndexed { index, c ->
            answer[index + 26] = map[c.toString()] ?: 0
        }
        
        return answer
    }
}