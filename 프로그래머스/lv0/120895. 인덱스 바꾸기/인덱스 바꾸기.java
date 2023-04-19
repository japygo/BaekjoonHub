class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        int length = my_string.length();
        if (1 < length && length < 100
           && 0 <= num1 && num1 < length
           && 0 <= num2 && num2 < length
           && num1 != num2) {
            String[] arr = new String[length];
            System.arraycopy(my_string.split(""), 0, arr, 0, length);
            String tmp = arr[num1];
            arr[num1] = arr[num2];
            arr[num2] = tmp;
            answer = String.join("", arr);
        }
        return answer;
    }
}