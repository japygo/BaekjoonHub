import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        if (2 <= n && n <= 10000) {
            Set<Integer> set = new HashSet<>();
            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    set.add(i);
                    n /= i;
                }
            }
            answer = set.stream().mapToInt(Integer::intValue).sorted().toArray();
        }
        return answer;
    }
}