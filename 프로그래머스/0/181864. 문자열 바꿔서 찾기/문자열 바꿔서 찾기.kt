class Solution {
    fun solution(myString: String, pat: String): Int {
        val str = myString.map { c -> if (c == 'A') 'B' else 'A' }.joinToString("")
        return if (str.contains(pat)) 1 else 0
    }
}