class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if (n > 0 && n < 1000
           && k >= (int) (n / 10) && k < 1000) {
            answer = 12000 * n + 2000 * (k - (int) (n / 10));
        }
        return answer;
    }
}