class Solution {
    public String solution(String my_string) {
        String answer = "";
        byte[] my_byte = my_string.getBytes();
        int length = my_byte.length;
        if (length >=1 && length <= 1000) {
            byte[] result = new byte[length];
            for (int i = 0 ; i < length ; i++) {
                result[i] = my_byte[length - 1 - i];
            }
            answer = new String(result);
        }
        return answer;
    }
}