class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length();
        String[] answer = new String[(int) Math.ceil((double) length / n)];
        if (1 <= length && length <= 100) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (String str : my_str.split("")) {
                sb.append(str);
                if (sb.length() == n) {
                    answer[i++] = sb.toString();
                    sb = new StringBuilder();
                }
            }
            if (!sb.toString().isEmpty()) {
                answer[i] = sb.toString();
            }
        }
        return answer;
    }
}