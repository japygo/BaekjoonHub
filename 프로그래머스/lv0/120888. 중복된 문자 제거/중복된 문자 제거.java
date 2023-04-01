import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        int length = my_string.length();
        if (1 <= length && length <= 110) {
            Set<String> set = new LinkedHashSet<>(Arrays.asList(my_string.split("")));
            answer = String.join("", set);
        }
        return answer;
    }
}