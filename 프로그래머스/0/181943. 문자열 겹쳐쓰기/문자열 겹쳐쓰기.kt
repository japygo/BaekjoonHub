class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        
        answer += my_string.substring(0, s)
        answer += overwrite_string
        
        if (answer.length < my_string.length) {
            answer += my_string.substring(answer.length, my_string.length)
        }
        
        return answer
    }
}