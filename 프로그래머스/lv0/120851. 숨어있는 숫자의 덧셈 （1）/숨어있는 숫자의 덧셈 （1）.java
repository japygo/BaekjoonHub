import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int length = my_string.length();
        if (1 <= length && length <= 1000) {
            List<Integer> list = new ArrayList<>();
            for (char c : my_string.toCharArray()) {
                if (Character.isDigit(c)) {
                    list.add(Integer.valueOf(String.valueOf(c)));
                }
            }
            answer = list.stream().mapToInt(Integer::intValue).sum();
        }
        return answer;
    }
}