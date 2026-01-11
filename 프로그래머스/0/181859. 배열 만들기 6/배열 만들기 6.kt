class Solution {
    fun solution(arr: IntArray): IntArray {
        val stk = mutableListOf<Int>()
        var i = 0
        while (i < arr.size) {
            if (stk.isEmpty()) {
                stk.add(arr[i])
            } else {
                if (stk.last() == arr[i]) {
                    stk.removeLast()
                } else {
                    stk.add(arr[i])
                }
            }
            i += 1
        }
        return if (stk.isEmpty()) intArrayOf(-1) else stk.toIntArray()
    }
}