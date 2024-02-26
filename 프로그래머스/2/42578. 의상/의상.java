import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, List<String>> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String name = clothe[0];
            String type = clothe[1];
            List<String> list = map.getOrDefault(type, new ArrayList<>());
            list.add(name);
            map.put(type, list);
        }

        for (List<String> value : map.values()) {
            answer *= value.size() + 1;
        }

        return answer - 1;
    }
}