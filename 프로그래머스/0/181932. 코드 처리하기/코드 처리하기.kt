class Solution {
    fun solution(code: String): String {
        var ret: String = ""
        var mode = 0
        
        code.forEachIndexed { idx, c ->
            if (mode == 0) {
                if (c == '1') {
                    mode = 1
                } else {
                    if (idx % 2 == 0) {
                        ret += c
                    }
                }
            } else {
                if (c == '1') {
                    mode = 0
                } else {
                    if (idx % 2 == 1) {
                        ret += c
                    }
                }
            }
        }
        
        return if (ret.isEmpty()) "EMPTY" else ret
    }
}