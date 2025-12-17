class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = num_list.toMutableList()
        val size = num_list.size
        val a = num_list[size - 2]
        val b = num_list[size - 1]
        
        if (a < b) {
            answer.add(b - a)
        } else {
            answer.add(b * 2)
        }
        
        return answer.toIntArray()
    }
}