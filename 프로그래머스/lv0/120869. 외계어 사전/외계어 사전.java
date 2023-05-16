class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        boolean isExist = false;
        for (String d : dic) {
            boolean isContain = true;
            for (String s : spell) {
                if (!d.contains(s)) {
                    isContain = false;
                    break;
                }
            }
            if (isContain) {
                isExist = true;
                break;
            }
        }
        if (isExist) {
            answer = 1;
        }
        return answer;
    }
}