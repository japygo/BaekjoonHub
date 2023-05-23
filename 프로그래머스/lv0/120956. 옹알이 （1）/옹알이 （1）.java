class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String b : babbling) {
            if (b.split("aya|ye|woo|ma").length == 0) {
                answer++;
            }
        }
        return answer;
    }
}