class Solution {
    public int solution(int n) {
        int answer = 0;
        if (0 < n && n <= 3628800) {
            int factorial = 1;
            int cnt = 1;
            while(factorial <= n) {
                cnt++;
                factorial = factorial * cnt;
            }
            answer = cnt - 1;
        }
        return answer;
    }
}