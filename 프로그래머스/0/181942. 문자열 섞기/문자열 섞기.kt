class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        
        str1.forEachIndexed { index, s ->
            answer += s
            answer += str2[index]
        }
        
        return answer
    }
}