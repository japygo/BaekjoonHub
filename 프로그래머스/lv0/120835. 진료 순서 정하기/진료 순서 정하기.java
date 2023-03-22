class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] answer = new int[length];
        if (length >= 1 && length <= 10) {
            for (int i = 0 ; i < length ; i++) {
                int num1 = emergency[i];
                int cnt = 1;
                for (int j = 0 ; j < length ; j++) {
                    int num2 = emergency[j];
                    if (i != j && num1 < num2) cnt++;
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }
}