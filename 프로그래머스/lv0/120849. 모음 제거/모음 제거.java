class Solution {
    public String solution(String my_string) {
        String answer = "";
        int length = my_string.length();
        StringBuilder result = new StringBuilder();
        if (1 <= length && length <= 1000) {
            String[] tmp = my_string.split("");
            for (int i = 0; i < length; i++) {
                if (!include(tmp[i])) {
                    result.append(tmp[i]);
                }
            }
            answer = result.toString();
        }
        return answer;
    }
    public boolean include(String a) {
        String[] moum = {"a", "e", "i", "o", "u"};
        for (String m : moum) {
            if (a.equals(m)) {
                return true;
            }
        }
        return false;
    }
}