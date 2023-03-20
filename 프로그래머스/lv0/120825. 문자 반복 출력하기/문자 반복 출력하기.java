class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int length = my_string.length();
        if (length >= 2 && length <= 5
           && n >= 2 && n <= 10) {
            byte[] my_byte = my_string.getBytes();
            byte[] result = new byte[length * n];
            for (int i = 0 ; i < length ; i++) {
                for (int j = 0 ; j < n ; j++) {
                    result[i * n + j] = my_byte[i];
                }
            }
            answer = new String(result);
        }
        return answer;
    }
}