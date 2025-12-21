class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        var answer: String = ""
        
        my_string.forEachIndexed { index, s ->
            if (index % m == c - 1) {
                answer += s
            }
        }
        
        return answer
    }
}