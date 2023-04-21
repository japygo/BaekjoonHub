import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        if (1 <= n && n <= 10000) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}