class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
        var prev = arr
        var next = arr.next()
        
        while (!prev.contentEquals(next)) {
            prev = next
            next = next.next()
            answer += 1
        }
        
        return answer
    }
    fun IntArray.next() = this.map {
        if (it >= 50 && it % 2 == 0) {
            it / 2
        } else if (it < 50 && it % 2 == 1) {
            it * 2 + 1
        } else {
            it
        }
    }.toIntArray()
}