import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(my_string);
        while (m.find()) {
            answer += Integer.parseInt(m.group());
        }
        return answer;
    }
}