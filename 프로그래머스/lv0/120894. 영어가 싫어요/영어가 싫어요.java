import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        int length = numbers.length();
        if (1 <= length && length <= 50) {
            StringBuilder sb = new StringBuilder();
            String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            Pattern p = Pattern.compile("zero|one|two|three|four|five|six|seven|eight|nine");
            Matcher m = p.matcher(numbers);
            while (m.find()) {
                sb.append(Arrays.asList(number).indexOf(m.group()));
            }
            answer = Long.valueOf(sb.toString());
        }
        return answer;
    }
}