class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n >= 1 && n <= 100) {
            while (true) {
                answer += 1;
                if (answer * 6 % n == 0) break;
            }
        }
        return answer;
    }
}