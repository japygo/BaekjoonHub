class Solution {
    public String solution(String my_string) {
        String answer = "";
        int length = my_string.length();
        if (1 <= length && length <= 1000) {
            StringBuilder sb = new StringBuilder();
            for (char c : my_string.toCharArray()) {
                if (97 <= (int) c && (int) c <= 122) {
                    sb.append(String.valueOf(c).toUpperCase());
                }
                if (65 <= (int) c && (int) c <= 90) {
                    sb.append(String.valueOf(c).toLowerCase());
                }
            }
            answer = sb.toString();
        }
        return answer;
    }
}