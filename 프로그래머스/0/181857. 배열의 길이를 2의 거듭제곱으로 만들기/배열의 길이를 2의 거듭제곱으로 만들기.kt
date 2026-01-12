class Solution {
    fun solution(arr: IntArray): IntArray {
        var n = 1
        while (arr.size > n) {
            n *= 2
        }
        var answer = arr
        repeat(n - arr.size) {
            answer += 0
        }
        return answer
    }
}