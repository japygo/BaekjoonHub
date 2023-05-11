class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int num = 0;
        for (String s : polynomial.split(" ")) {
            if (s.equals("+")) {
                continue;
            }
            if (s.equals("x")) {
                x += 1;
            } else if (s.endsWith("x")) {
                x += Integer.parseInt(s.substring(0, s.length() - 1));
            } else {
                num += Integer.parseInt(s);
            }
        }
        if (x > 0) {
            answer += x + "x";
            if (x == 1) {
                answer = "x";
            }
        }
        if (x > 0 && num > 0) {
            answer += " + ";
        }
        if (num > 0) {
            answer += num;
        }
        return answer;
    }
}