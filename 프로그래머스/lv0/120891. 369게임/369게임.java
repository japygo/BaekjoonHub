class Solution {
    public int solution(int order) {
        int answer = 0;
        if (1 <= order && order <= 1000000) {
            String[] arr = String.valueOf(order).split("");
            for (String s : arr) {
                if ("369".contains(s)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}