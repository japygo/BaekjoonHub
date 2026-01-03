class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        var str = myString
        while (true) {
            val index = str.indexOf(pat)
            if (index == -1) break
            str = str.substring(index + 1)
            answer++
        }
        return answer
    }
}