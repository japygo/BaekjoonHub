class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        var answer: String = ""
        
        code.forEachIndexed { index, c ->
            if (index % q == r) {
                answer += c
            }
        }
        
        return answer
    }
}