class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int length = cipher.length();
        if (1 <= length && length <= 1000
           && 1 <= code && code <= length) {
            String[] arr = cipher.split("");
            for (int i = 0; i < length; i++) {
                if ((i + 1) % code == 0) {
                    answer += arr[i];
                }
            }
        }
        return answer;
    }
}