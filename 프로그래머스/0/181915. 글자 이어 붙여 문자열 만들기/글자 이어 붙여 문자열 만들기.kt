class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        var answer: String = ""
        
        for (index in index_list) {
            answer += my_string[index]
        }
        
        return answer
    }
}