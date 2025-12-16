class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        var sum = a
        
        included.forEachIndexed { index, isInclude ->
            if (isInclude) {
                answer += sum
            }
            sum += d
        }
        
        return answer
    }
}