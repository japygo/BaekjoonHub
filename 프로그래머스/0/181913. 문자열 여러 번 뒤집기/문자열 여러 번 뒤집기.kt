class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer = StringBuilder(my_string)
        
        for (query in queries) {
            val s = query[0]
            val e = query[1]
            answer.replace(s, e + 1, answer.substring(s, e + 1).reversed())
        }
        
        return answer.toString()
    }
}