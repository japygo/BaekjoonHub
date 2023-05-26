import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        if (Arrays.stream(before.split("")).sorted().collect(Collectors.joining()).equals(Arrays.stream(after.split("")).sorted().collect(Collectors.joining()))) {
            answer = 1;
        }
        return answer;
    }
}