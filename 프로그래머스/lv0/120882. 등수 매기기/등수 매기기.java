import java.util.Arrays;
class Solution {
    public int[] solution(int[][] score) {
        int length = score.length;
        int[] answer = new int[length];
        double[] avg = new double[length];
        for (int i = 0; i < length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        Arrays.fill(answer, 1);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    if (avg[i] < avg[j]) {
                        answer[i] += 1;
                    }
                }
            }
        }
        return answer;
    }
}