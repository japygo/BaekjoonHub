class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        for (index in 0..my_string.length - 1) {
            answer += my_string.substring(index, my_string.length)
        }
        answer.sort()
        
        return answer
    }
}