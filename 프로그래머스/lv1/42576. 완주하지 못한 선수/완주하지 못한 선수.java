import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String s : completion) {
            map.putIfAbsent(s, 0);
            map.computeIfPresent(s, (k, v) -> v + 1);
        }
        for (String s : participant) {
            if (!map.containsKey(s) || map.get(s) == 0) {
                answer = s;
                break;
            }
            map.computeIfPresent(s, (k, v) -> v - 1);
        }
        return answer;
    }
}