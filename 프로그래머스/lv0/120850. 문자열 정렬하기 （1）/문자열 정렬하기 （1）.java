import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int length = my_string.length();
        if (1 <= length && length <= 100) {
            List<Integer> list = new ArrayList<>();
            for (char c : my_string.toCharArray()) {
                if (Character.isDigit(c)) {
                    list.add(Integer.valueOf(String.valueOf(c)));
                }
            }
            answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}