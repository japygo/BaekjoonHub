class Solution {
    public int[] solution(int n) {
        int length = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[length];
        if (n >= 1 && n <= 100) {
            int cnt = 0;
            for (int i = 0 ; i < length ; i++) {
                answer[i] = 2 * i + 1;
            }
        }
        return answer;
    }
}