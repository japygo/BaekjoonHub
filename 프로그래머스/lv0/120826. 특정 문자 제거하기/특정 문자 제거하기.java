class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        int length = my_string.length();
        if (length >= 1 && length <= 100
           && letter.length() == 1) {
            for (int i = 0 ; i < length ; i++) {
                char c = my_string.charAt(i);
                String str = String.valueOf(c);
                if (!letter.equals(str)) {
                    answer += str;
                }
            }
        }
        return answer;
    }
}