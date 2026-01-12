class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        return arr.mapIndexed { index, num ->
            if (arr.size % 2 != index % 2) {
                num + n
            } else {
                num
            }
        }.toIntArray()
    }
}