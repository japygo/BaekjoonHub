class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        arr.forEachIndexed { index, num ->
            if (flag[index]) {
                repeat(num * 2) {
                    answer += num
                }
            } else {
                answer = answer.sliceArray(0 until answer.size - num)
            }
        }
        
        return answer
    }
}