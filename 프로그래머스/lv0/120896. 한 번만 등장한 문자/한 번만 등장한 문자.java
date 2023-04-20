import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if (0 < length && length < 1000) {
            Map<String, Integer> map = new HashMap<>();
            for (String word : s.split("")) {
                map.merge(word, 1, Integer::sum);
            }
            
            List<String> list = new ArrayList<>();
            map.forEach((key, value) -> {
                if (value == 1) {
                    list.add(key);
                }
            });
            answer = list.stream().sorted().collect(Collectors.joining());
        }
        return answer;
    }
}