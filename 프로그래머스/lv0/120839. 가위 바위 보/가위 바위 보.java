class Solution {
    public String solution(String rsp) {
        String answer = "";
        int length = rsp.length();
        if (length > 0 && length <= 100) {
            String[] strs = rsp.split("");
            for (String str : strs) {
                if (str.equals("2")) {
                    answer += "0";
                } else if (str.equals("0")) {
                    answer += "5";
                } else if (str.equals("5")) {
                    answer += "2";
                }
            }
        }
        return answer;
    }
}