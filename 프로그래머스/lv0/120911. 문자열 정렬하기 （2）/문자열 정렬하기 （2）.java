import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        int length = my_string.length();
        if (0 < length && length < 100) {
            answer = Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
        }
        return answer;
    }
}