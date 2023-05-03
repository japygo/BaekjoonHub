class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        if (1 <= n && n <= 10
           && 1 <= t && t <= 15) {
            answer = n;
            for (int i = 0; i < t; i++) {
                answer *= 2;
            }
        }
        return answer;
    }
}