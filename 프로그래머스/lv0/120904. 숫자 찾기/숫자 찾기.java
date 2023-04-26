class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        if (0 < num && num < 1000000
           && 0 <= k && k < 10) {
            answer = String.valueOf(num).indexOf(String.valueOf(k));
            if (answer != -1) {
                answer++;
            }
        }
        return answer;
    }
}