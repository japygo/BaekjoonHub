class Solution {
    public int solution(int n) {
        int answer = 0;
        if (1 <= n && n <= 1000000) {
            if (String.valueOf(Math.sqrt(n)).endsWith(".0")) {
                answer = 1;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}