class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if (slice >= 2 && slice <= 10
           && n >= 1 && n <= 100) {
            while (true) {
                answer += 1;
                if (answer * slice >= n) break;
            }
        }
        return answer;
    }
}