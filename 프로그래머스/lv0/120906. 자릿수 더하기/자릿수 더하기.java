class Solution {
    public int solution(int n) {
        int answer = 0;
        if (0 <= n && n <= 1000000) {
            for (String s : String.valueOf(n).split("")) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}