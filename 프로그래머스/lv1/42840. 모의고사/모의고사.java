import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] supo1 = { 1, 2, 3, 4, 5 };
        int[] supo2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] supo3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int[] cnt = { 0, 0, 0 };

        for (int i = 0; i < answers.length; i++) {
            int s1 = supo1[i % supo1.length];
            int s2 = supo2[i % supo2.length];
            int s3 = supo3[i % supo3.length];
            if (s1 == answers[i]) {
                cnt[0]++;
            }
            if (s2 == answers[i]) {
                cnt[1]++;
            }
            if (s3 == answers[i]) {
                cnt[2]++;
            }
        }

        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int c : cnt) {
            if (max < c) {
                max = c;
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            if (max == cnt[i]) {
                list.add(i + 1);
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}