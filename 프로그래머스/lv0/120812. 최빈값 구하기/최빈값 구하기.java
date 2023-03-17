import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int length = array.length;
        if (length > 0 && length < 100) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : array) {
                int cnt = 0;
                if (map.get(num) != null) {
                    cnt = map.get(num).intValue();
                }
                cnt += 1;
                map.put(num, cnt);
            }
            int max = 0;
            for (int num : array) {
                int cnt = map.get(num).intValue();
                if (max < cnt) {
                    max = cnt;
                    answer = num;
                }
            }
            for (int num : array) {
                int cnt = map.get(num).intValue();
                if (max == cnt && answer != num) return -1;
            }
        }
        return answer;
    }
}