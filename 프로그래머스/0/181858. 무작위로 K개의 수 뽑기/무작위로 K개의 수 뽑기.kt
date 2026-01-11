class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        val answer = mutableListOf<Int>()
        arr.toSet().forEach {
            if (answer.size < k) {
                answer.add(it)
            }
        }
        while (answer.size < k) {
            answer.add(-1)
        }
        return answer.toIntArray()
    }
}